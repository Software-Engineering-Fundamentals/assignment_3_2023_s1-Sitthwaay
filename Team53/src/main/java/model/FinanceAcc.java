public class FinanceAcc extends Account{

    public FinanceAcc(String name,String id,String password){
        super(name,id,password);
    }
     
    public void resolve_refund_request(){
        // get from database
        Refund_Request rr = new Refund_Request("name_of_course", "trainee_id");

        // finance manager resolves the refund request
        int firstSessionTime = 100; //first session time result from database
        int timenow = 75; //current time
        int remainTime = firstSessionTime - timenow;

        if(remainTime > 24){ //if has more than 24 hour left, refund success
            rr.approve_refund();
        }else{
            rr.reject_refund();
        }
    }
    
}

