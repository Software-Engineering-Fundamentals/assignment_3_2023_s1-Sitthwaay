public class Refund_Request {
    String course_name;
    String id;
    public Refund_Request(String course_name,String id){
        this.course_name = course_name;
        this.id = id;
    }
    public boolean request_refund(){

        //save request into database and send to finance manager
        FinanceAcc financeManager = new FinanceAcc("m_name", "m_id","m_pw");

        //result from finance manager
        boolean result = financeManager.receiveReq(this.course_name,this.id);
        return result;
    }
}
