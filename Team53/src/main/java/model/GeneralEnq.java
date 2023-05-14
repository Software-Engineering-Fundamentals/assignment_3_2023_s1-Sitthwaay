public abstract class GeneralEnq {
    String id;
    String content;
    String response = "";
    public GeneralEnq(){
        this.id = "";
        this.content = "";
    }
    public GeneralEnq(String id,String content){
        this.id = id;
        this.content = content;
    }
    public void lodge_enquiry(){

        System.out.println("save"+content+"into database");

        //manager view enquiry and response
        //manager get this enquiry from database with get_enquiry()
        ManagerAcc manager = new ManagerAcc("manager_name","manager_id","manager_pw");
        
        response = manager.add_response(content);
    }
}