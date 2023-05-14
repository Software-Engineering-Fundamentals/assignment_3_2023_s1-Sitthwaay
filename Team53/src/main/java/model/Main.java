public class Main {
    public static void main(String[] args) throws Exception {

        //request refund
        TraineeAcc trainee = new TraineeAcc("user_Name","user_Id","user_Password");
        trainee.request_refund();
        
         //lodge enquiry
        Enquiry enq = new Enquiry(trainee.id, "__Trainee write this content__");
        enq.lodge_enquiry();
        //view response
        // get_Enquiry(enq) and receive response from database
        System.out.println(enq.response);
    }
}