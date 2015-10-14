package model;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class AdapterTest {
    @Test
    public void OldPayGatewayTest(){
        PayGetewayOld payGetewayOld = new PayGatewayOldImpl();
        payGetewayOld.setCreditCardNo("1");
        payGetewayOld.setClientName("Test Client 1");
        payGetewayOld.setAmount(1);

        assertEquals(payGetewayOld.getCreditCardNo(), "1");
        assertEquals(payGetewayOld.getClientName(), "Test Client 1");
        assertEquals(payGetewayOld.getAmount(), 1, 0);
    }

    @Test
    public void AdapterGatewayTest(){
        PayGetewayOld payGetewayOld = new PayGatewayOldImpl();
        payGetewayOld.setCreditCardNo("1");
        payGetewayOld.setClientName("Test Client 1");
        payGetewayOld.setAmount(1);

        OldToNewGatewayAdapter gatewayAdapter = new OldToNewGatewayAdapter(payGetewayOld);
        Map <String, String> oldGatewayAttributes = new HashMap<>();
        oldGatewayAttributes.put("creditCardNo",payGetewayOld.getCreditCardNo());
        oldGatewayAttributes.put("clientName",payGetewayOld.getClientName());

        assertEquals(gatewayAdapter.getCreditCardAttributes(), oldGatewayAttributes);
        assertEquals(gatewayAdapter.getAmount(), payGetewayOld.getAmount(), 0);
    }
}
