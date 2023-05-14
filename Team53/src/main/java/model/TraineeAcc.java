
public class TraineeAcc extends Account{

    public TraineeAcc(String name,String id,String password){
        super(name,id,password);
    }
    public void request_refund(){

        Refund_Request rr = new Refund_Request("name_Of_Course", this.id); //trainee request a refund for a course(name_Of_Course)
        
        // receive outcome from Refund_Request
        boolean outcome = rr.request_refund();
        if (outcome){
            System.out.println("success");
        }else{
            System.out.println("fail");
        }

    }
}
