import java.util.ArrayList;

public class TraineeAcc extends Account{
    ArrayList<String> enquiry_IDs;
    public TraineeAcc(String name,String id,String password){
        super(name,id,password);
        this.enquiry_IDs = new ArrayList<>();
    }
    public void request_refund(){
        System.out.println("refund request created");
        Refund_Request rr = new Refund_Request("name_Of_Course", this.id); //trainee request a refund for a course(name_Of_Course)
        
        // refund is saved to database
        System.out.println("refund request saved to database");
    }
    public String view_refund_status(String course_name){
        // get refund status from database using course_name and trainee's id
        System.out.println("get refund status from database using course_name and trainee's id");

        // simulate getting resolved refund request from database
        Refund_Request rr = new Refund_Request(course_name, this.id);
        rr.approve_refund();

        // outcome of refund request is returned
        return rr.get_outcome();

    }
    public void lodge_enquiry(String content){
        // create enquiry
        System.out.println("create enquiry");
        String id = "enquiry_id";
        Enquiry enq = new Enquiry(id, content);

        // enquiry is saved to user's list of enquiries
        System.out.println("id added to user's list of enquiries");
        enquiry_IDs.add(id);

        // enquiry is saved to database
        System.out.println("enquiry saved to database");
    }
    public Enquiry view_enquiry_response(String enquiry_ID) {
        // get enquiry from database using enquiry_ID
        System.out.println("get enquiry from database using enquiry_ID");

        // simulate getting enquiry from database
        Enquiry enq = new Enquiry(enquiry_ID, "enquiry_content");
        enq.add_response("this is a response");

        // enquiry is returned
        return enq;
    }
}
