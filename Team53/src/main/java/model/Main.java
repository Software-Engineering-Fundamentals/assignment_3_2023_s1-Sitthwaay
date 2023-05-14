public class Main {
    public static void main(String[] args) throws Exception {
        
        // create accounts
        TraineeAcc trainee = new TraineeAcc("user_Name","user_Id","user_Password");
        FinanceAcc finance = new FinanceAcc("finance_Name","finance_Id","finance_Password");
        ManagerAcc manager = new ManagerAcc("manager_Name","manager_Id","manager_Password");
        GeneralUser user = new GeneralUser();

        System.out.println("\nScenario 1: Trainee lodges enquiry, manager responds, trainee views response");

        // trainee requests refund
        System.out.println("**trainee requesting refund**");
        trainee.request_refund();
        // finance manager resolves refund request
        System.out.println("**finance manager resolving refund request**");
        finance.resolve_refund_request();
        // trainee views refund status
        System.out.println("**trainee viewing refund status**");
        System.out.println("Outcome of refund request: " + trainee.view_refund_status("request_ID"));
        
        System.out.println("\nScenario 2.1: Trainee lodges enquiry, manager addresses enquiry, trainee views response");
        // lodge enquiry (trainee)
        System.out.println("**trainee lodging enquiry**");
        trainee.lodge_enquiry("enquiry_content");

        // manager responds to enquiry
        System.out.println("**manager responding to enquiry**");
        manager.respond_to_enquiry();

        // trainee views enquiry response
        System.out.println("**trainee viewing enquiry response**");
        Enquiry enq = trainee.view_enquiry_response(trainee.enquiry_IDs.get(0));
        System.out.println("This is the enquiry: " + enq.get_content());
        System.out.println("This is the response: " + enq.get_response());

        System.out.println("\nScenario 2.2: General user lodges enquiry, manager addresses enquiry, general user views response");
        // general user lodges enquiry
        System.out.println("**general user lodging enquiry**");
        user.lodge_enquiry("enquiry_content");

        // manager responds to enquiry
        System.out.println("**manager responding to enquiry**");
        manager.respond_to_enquiry();

        // general user views enquiry response
        System.out.println("**general user viewing enquiry response**");
        Enquiry enq2 = user.view_enquiry_response(user.enquiry_IDs.get(0));
        System.out.println("This is the enquiry: " + enq2.get_content());
        System.out.println("This is the response: " + enq2.get_response());

    }
}