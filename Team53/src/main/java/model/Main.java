public class Main {
    public static void main(String[] args) throws Exception {
        TraineeAcc ta = new TraineeAcc("user_Name","user_Id","user_Password");
        Refund_Request rr = new Refund_Request("name_Of_Course", ta.id); //trainee request a refund for a course(name_Of_Course)
        boolean result_refund = rr.request_refund(); //result return from finance manager
        if (result_refund){
            System.out.println("success");
        }else{
            System.out.println("fail");
        }
    }
}
