package PAFassessment.app.models;

import java.util.UUID;

public class Transactions {
    private String transactionId;
    private String amount;
    private String date;

    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void create(String transactionId){
        this.transactionId = UUID.randomUUID().toString().substring(0, 8);
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    
}
