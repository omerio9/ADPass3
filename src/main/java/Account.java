import java.util.Date;


public class Account {
    private String id;
    private  String ownerName;
    private String accType;
    private double balance;
    private Date accessTime;



    public Account(String id,String ownerName,double balance){
        this.id=id;
        this.ownerName=ownerName;
        this.balance=balance;
    }
    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }


    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }


    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getOwnerName() {
        return ownerName;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }
    public Date getAccessTime() {
        return accessTime;
    }



   public void depositCash(double deposit){
       System.out.println("Previous balance is R"+this.getBalance());
        double new_Balance= getBalance()+deposit;
        System.out.println("New deposit of R"+deposit);
        this.setBalance(new_Balance);
        System.out.println("Your new balance is now R"+this.getBalance());




       }


    public void withdrawCash(double amount){

    }
   }//end Class




