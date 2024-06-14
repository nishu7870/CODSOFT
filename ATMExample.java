   import java.util.Scanner;  
    
public class ATMExample  
{  
    public static void main(String args[] )  
    {   
        int balance = 100000, withdraw, deposit;  
            
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine (ATM)");  
            System.out.println("Choose 1 for Money Withdrawal ");  
            System.out.println("Choose 2 for Deposit of Money");  
            System.out.println("Choose 3 for Account Balance Check");  
            System.out.println("Choose 4 for EXIT (Main Menu)");  
            System.out.print("Choose the action you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter amount of money to be withdrawn:");  
                      
        
        withdraw = sc.nextInt();  
                      
    
        if(balance >= withdraw)  
        {  
    
            balance = balance - withdraw;  
            System.out.println("Please collect your money from the machine\n");  
        }  
        else  
        {     
            System.out.println("Insufficient Balance in the account");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter amount of the money to be deposited:");  
                       
        deposit = sc.nextInt();  
                      
         
        balance = balance + deposit;  
        System.out.println("Money has been deposited successfully");  
        System.out.println("");  
        break;  
   
                case 3:  
    
        System.out.println("Balancein the account : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:    
        System.exit(0);  
            }  
        }  
    }  
}