public class ManagerAcc extends Account{

    public ManagerAcc(String name,String id,String password){
        super(name,id,password);
    }

    public String respondEnq(String content){
        System.out.println("Manager read the "+content);
        String response = "__This is the manager response__";
        return response;
    }
}