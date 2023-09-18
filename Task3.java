import java.util.Scanner;  
  
/* TASK 3: ATM INTERFACE */
public class Task3{     
    public static void main(String args[] )  
    {  
        int balance = 10000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("1 for Withdraw");  
            System.out.println("2 for Deposit");  
            System.out.println("3 for Check Balance");  
            System.out.println("4 for EXIT");  
            System.out.print("Choose one option from above:");  

            int choose = sc.nextInt();  
            switch(choose)  
            {  
                case 1:
                System.out.print("Enter amount to be withdrawn:");
                withdraw = sc.nextInt();
                if(balance >= withdraw){  
                    balance = balance - withdraw;  
                    System.out.println("Reaming balance= "+balance);  
                }  
                else{  
                    System.out.println("Insufficient Balance");  
                }
                break;

                case 2:
                System.out.print("Enter amount to be deposited:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Money has been successfully deposited");  
                System.out.println("Current amount= "+balance);  
                break;

                case 3:  
                System.out.println("Balance : "+balance);
                break; 
                
                case 4:
                System.exit(0);
                System.out.println("Thanks for your time");
            }  
        } 
    }  
}  
