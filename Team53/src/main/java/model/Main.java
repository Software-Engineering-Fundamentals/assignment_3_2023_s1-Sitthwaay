public class Main {
    public static void main(String[] args) throws Exception {

        // trainee requests refund
        TraineeAcc trainee = new TraineeAcc("user_Name","user_Id","user_Password");
        trainee.request_refund();
        // finance manager resolves refund request
        FinanceAcc finance = new FinanceAcc("finance_Name","finance_Id","finance_Password");
        finance.resolve_refund_request();
        // trainee views refund status
        System.out.println(trainee.view_refund_status("request_ID"));
        
         //lodge enquiry 
        Enquiry enq = new Enquiry(trainee.id, "__Trainee write this content__");
        enq.lodge_enquiry();
        //view response
        // get_Enquiry(enq) and receive response from database
        System.out.println(enq.response);
    }
}