package adapter.model;

import com.google.common.base.Objects;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class PayGatewayNewImpl implements PayGatewayNew {
    private String gatewayName="New Pay gateway";
    private HashMap<String,String> creditCardAttributes;
    private float amount;

    public String getGatewayName() {
        return gatewayName;
    }

    public Map<String, String> getCreditCardAttributes() {
        return ImmutableMap.copyOf(this.creditCardAttributes);
    }

    public float getAmount() {
        return this.amount;
    }

    public void setCreditCardAttributes( HashMap<String,String> attributes) {
        this.creditCardAttributes = attributes;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayGatewayNewImpl that = (PayGatewayNewImpl) o;
        return Objects.equal(amount, that.amount) &&
                Objects.equal(gatewayName, that.gatewayName) &&
                Objects.equal(creditCardAttributes, that.creditCardAttributes);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gatewayName, creditCardAttributes, amount);
    }

    @Override
    public String toString() {
        return "PayGatewayNewImpl{" +
                "gatewayName='" + gatewayName + '\'' +
                ", creditCardAttributes=" + creditCardAttributes +
                ", amount=" + amount +
                '}';
    }
}
