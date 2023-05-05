public class Main {
    public static void main(String[] args) throws Exception {
        TraineeAcc ta = new TraineeAcc("user_Name","user_Id","user_Password");
        Refund_Request rr = new Refund_Request("nameOfCourse", ta.id);
        System.out.println(rr.id);
    }
}
