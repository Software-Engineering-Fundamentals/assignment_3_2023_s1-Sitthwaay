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
    public void lodgeEnquiry(){
        ManagerAcc manager = new ManagerAcc("manager_name","manager_id","manager_pw");
        response = manager.respondEnq(content);
    }
}