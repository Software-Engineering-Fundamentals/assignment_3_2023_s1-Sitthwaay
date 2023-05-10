public class FinanceAcc extends Account{

    public FinanceAcc(String name,String id,String password){
        super(name,id,password);
    }
    public static void main(String[] args) throws Exception {
        
        System.out.println("hello user");
    }
     
    public boolean receiveReq(String course,String stuId){
        System.out.println("Manager check database to search for first session time of "+course);
        int firstSessionTime = 100; //first session time result from database
        int timenow = 75; //current time
        int remainTime = firstSessionTime - timenow;
        if(remainTime > 24){ //if has more than 24 hour left, refund success
            return true;
        }else{
            return false;
        }
    }
    
}

