package model;

import com.google.common.base.Objects;

/**
 * Created by dmakarov on 10/7/2015.
 */
public class PayGatewayOldImpl implements PayGetewayOld{
    private String gatewayName="Old Pay gateway";
    private String creditCardNo;
    private String clientName;
    private float amount;

    public String getGatewayName() {
        return gatewayName;
    }


    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    public String getClientName() {
        return this.clientName;
    }

    public float getAmount() {
        return this.amount;
    }

    public void setCreditCardNo(String number) {
        this.creditCardNo = number;
    }

    public void setClientName(String name) {
        this.clientName = name;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PayGatewayOldImpl that = (PayGatewayOldImpl) o;
        return Objects.equal(amount, that.amount) &&
                Objects.equal(gatewayName, that.gatewayName) &&
                Objects.equal(creditCardNo, that.creditCardNo) &&
                Objects.equal(clientName, that.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gatewayName, creditCardNo, clientName, amount);
    }

    @Override
    public String toString() {
        return "PayGatewayOldImpl{" +
                "gatewayName='" + gatewayName + '\'' +
                ", creditCardNo='" + creditCardNo + '\'' +
                ", clientName='" + clientName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
