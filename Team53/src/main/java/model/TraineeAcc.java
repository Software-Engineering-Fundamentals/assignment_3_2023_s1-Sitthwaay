public class TraineeAcc extends Account{
    public TraineeAcc(String name,String id,String password){
        super(name,id,password);
    }
    public void request_refund(){
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
        Enquiry enq = new Enquiry(this.id, content);

        // enquiry is saved to database
        System.out.println("enquiry saved to database");
    }
}
