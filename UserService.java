public class UserService{

    private  static final String MY_TABLE = "MyTable";

    public static boolean changePassword(String userName, String password){
        DatabaseReference myDb = FirebaseDatabase.getInstance().getReference(MY_TABLE);

        if(!userName.equals("") && !password.equals("") && password.length>7){
            myDb.update(userName,password)
            return true;
        }
        return false;
    }

}