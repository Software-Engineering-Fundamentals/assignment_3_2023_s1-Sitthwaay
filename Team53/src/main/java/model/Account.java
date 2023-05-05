public abstract class Account {
    String name;
    String id;
    String password;
    public Account(){
        this.name = "";
        this.id = "";
        this.password = "";
    }
    public Account(String name,String id,String password){
        this.name = name;
        this.id = id;
        this.password = password;
    }
}
