package adapter.model;

/**
 * Created by dmakarov on 10/7/2015.
 */
public interface PayGetewayOld {
    public String getCreditCardNo();
    public String getClientName();
    public float getAmount();

    public void setCreditCardNo(String number);
    public void setClientName(String name);
    public void setAmount (float amount);
}
