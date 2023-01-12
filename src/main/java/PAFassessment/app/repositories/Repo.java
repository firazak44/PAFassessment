package PAFassessment.app.repositories;

import org.springframework.stereotype.Repository;
import PAFassessment.app.models.Accounts;
import PAFassessment.app.models.Transactions;

@Repository
public class Repo {
    Accounts acc = new Accounts();
    Transactions amount = new Transactions();
    // public boolean = true;
    public String checks(String transferamount){
        // String account_id = "exists";
        if (amount != null) {
            if (acc.getBalance(acc > 0))
                transferamount
        } else {
            return toString();
        }
        // return account_id;
        return transferamount;
    }
}
