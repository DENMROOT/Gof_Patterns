package model;

import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/**
 * Created by dmakarov on 10/7/2015.
 */
public interface PayGatewayNew {
    public Map<String, String> getCreditCardAttributes();
    public float getAmount();

    public void setCreditCardAttributes(HashMap<String,String> attributes);
    public void setAmount (float amount);
}
