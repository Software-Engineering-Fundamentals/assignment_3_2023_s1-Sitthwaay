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
    public void add_response(String response){
        this.response = response;
    }
    public String get_response(){
        return response;
    }
    public String get_id(){
        return id;
    }
    public String get_content(){
        return content;
    }
}