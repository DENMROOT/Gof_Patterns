package model;

import com.google.common.collect.ImmutableMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class OldToNewGatewayAdapter implements PayGatewayNew {
    private PayGetewayOld oldPayGateway;

    public OldToNewGatewayAdapter(PayGetewayOld oldPayGateway) {
        this.oldPayGateway = oldPayGateway;
    }

    public Map<String, String> getCreditCardAttributes() {
        Map <String,String> attributes = new HashMap<String, String>();
        attributes.put("creditCardNo", oldPayGateway.getCreditCardNo());
        attributes.put("clientName", oldPayGateway.getClientName());
        return ImmutableMap.copyOf(attributes);
    }

    public float getAmount() {
        return oldPayGateway.getAmount();
    }

    public void setCreditCardAttributes(HashMap<String, String> attributes) {
        oldPayGateway.setCreditCardNo(attributes.get("creditCardNo"));
        oldPayGateway.setClientName(attributes.get("clientName"));
    }

    public void setAmount(float amount) {
        oldPayGateway.setAmount(amount);
    }
}
