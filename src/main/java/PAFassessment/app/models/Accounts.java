package PAFassessment.app.models;

import jakarta.json.Json;
import jakarta.json.JsonObject;

public class Accounts {
    private String account_id;
    private String name;
    private String balance;

    public String getAccount_id() {
        return account_id;
    }
    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public JsonObject toJson(){
        return Json.createObjectBuilder()
        .add("account_id", account_id)
        .add("name", name)
        .add("balance", balance)
        .build();
    }

    public static Accounts data(JsonObject doc){
        final Accounts ac = new Accounts();
        ac.setAccount_id(doc.getString("account_id"));
        ac.setName(doc.getString("name"));
        ac.setBalance(doc.getString("balance"));
        return ac;
    }
    
}
