
public class customer { 
    //encapsulation
    //data hiding
    //private variables
    //cannot be accessed from outside the class
    private String customerName;
    private int cardNumber;


    //getter and setter
    //to set and get the values
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    

}