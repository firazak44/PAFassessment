package PAFassessment.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import PAFassessment.app.models.Accounts;
import PAFassessment.app.models.Transactions;

@Controller
@RequestMapping(path="/transfer")
public class TxController {

    @PostMapping
    public String transfer(){
        // if(account_id.checkIfError()){
        //     return "error";
        // }else{
        //     if (Transactions.class(amount)) {
                
        //     } else {
                
        //     }
        // }
        return "transfer";

    }

}
