public class Refund_Request {
    String course_name;
    String id;
    String outcome = "pending";
    public Refund_Request(String course_name,String id){
        this.course_name = course_name;
        this.id = id;
    }
    public String get_outcome(){
        return outcome;
    }
    public void approve_refund(){
        this.outcome = "Approved";
    }
    public void reject_refund(){
        this.outcome = "Rejected";
    }

}
