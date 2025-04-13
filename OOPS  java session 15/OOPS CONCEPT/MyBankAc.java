public class MyBankAc {
    public static void main(String args[]){
        MyAccount person1 = new MyAccount();
        person1.UserName = "NIRAJ KUMAR CHAUHAN";
        person1.setPassword("kfjjjkhdjsh342");
    }
}
class MyAccount{
    String UserName;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
