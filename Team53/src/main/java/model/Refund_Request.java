public class Refund_Request {
    String course_name;
    String id;
    public Refund_Request(String course_name,String id){
        this.course_name = course_name;
        this.id = id;
    }
    public void request_refund(){
        System.out.println("sent "+course_name+" and " + id + "to finance mananger");
    }
}
