public class ManagerAcc extends Account{

    public ManagerAcc(String name,String id,String password){
        super(name,id,password);
    }

    public void respond_to_enquiry(){
        //manager gets this enquiry from database
        System.out.println("manager gets enquiry from database");
        Enquiry enquiry = new Enquiry("enquiry_id","enquiry_content");

        // manager is prompted to enter response
        System.out.println("manager is prompted to enter response and enters response");
        String response = "__This is the manager response__";
        enquiry.add_response(response);

        // response is saved to database
        System.out.println("enquiry with response saved to database");
    }
}