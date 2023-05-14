import java.util.ArrayList;

public class GeneralUser{
    ArrayList<String> enquiry_IDs;
    public GeneralUser(){
        this.enquiry_IDs = new ArrayList<>();
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
