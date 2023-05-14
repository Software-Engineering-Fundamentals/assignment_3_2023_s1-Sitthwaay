public class FinanceAcc extends Account{

    public FinanceAcc(String name,String id,String password){
        super(name,id,password);
    }
     
    public void resolve_refund_request(){
        // get from database
        System.out.println("get refund request from database");
        Refund_Request rr = new Refund_Request("name_of_course", "trainee_id");

        // finance manager resolves the refund request
        System.out.println("finance manager gets the first session time of the course");
        int firstSessionTime = 100; //first session time result from database
        int timenow = 75; //current time
        System.out.println("finance manager determines validity of refund request");
        int remainTime = firstSessionTime - timenow;

        System.out.println("finance manager approves or rejects refund request based on validity");
        if(remainTime > 24){ //if has more than 24 hour left, refund success
            rr.approve_refund();
        }else{
            rr.reject_refund();
        }
    }
    
}

