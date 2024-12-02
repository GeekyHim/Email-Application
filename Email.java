
import java.util.Scanner;
public class Email {
    //yaha se object creation hoga
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private String companySuffix = "mycompany.com";
    private String alternateEmail;

    // constructor to recieve the first name and last name
    public Email(String firstName, String lastName){
        // this refers to the class level variable
        // this(class level) = local level
        this.firstName = firstName;
        this.lastName = lastName;
//        System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);

        // call a method to ask for department and then return the department
        this.department = setDepartment();
//        System.out.println("Department is "+this.department);

        // call a method to generate a random password
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your Password is "+this.password);
        //combine elements to form the email 
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department +"." + this.companySuffix;  
//        System.out.println("Your email is: "+email);
        System.out.println("Email Succesfully Created\n\n\n");
}

    // ask for the department (setter method for department)
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES:\n1.For Sales\n2.For Development\n3.For Accounting\n0.For None\nEnter the Department Code:");
        Scanner scn = new Scanner(System.in);
        int depChoice = scn.nextInt();
        if(depChoice == 1) return "sales";
        else if(depChoice == 2) return "dev";
        else if(depChoice == 3) return "acct";
        else return "";   
    }
    
    // random password needs to be generated
    private String randomPassword(int length){
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#";
        char [] password = new char[length];
        for(int i=0;i<length;i++){
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }
    
    // mailbox ki capacity set karni hai 
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    // alt email set up karna hai 
    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    // password manage karna hai 
    public void changePassword(String password){
        this.password = password;
    }
    
    //getter methods
    public int getMailboxCapacity() { return this.mailboxCapacity; }
    public String getAlternateEmail() { return this.alternateEmail; }
    public String getPassword() { return this.password; }

    public String showInformation(){
        return "Employee Name: " + this.firstName + " " + this.lastName + "\n" +
        "Employee Email: "+ this.email + "\n" +
        "Password: "+ this.password +"\n" +
        "Mailbox Capacity: "+ this.mailboxCapacity +" Mb\n";
    }
}
