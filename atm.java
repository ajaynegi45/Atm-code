import java.util.*;
public class atm {
    public static void main (String[] args){

        //create scanner class object to get choice of user
        Scanner input = new Scanner(System.in);
    
        // declare and initialize balance, withdraw, and deposit    
        int b = 10000,w,d;

        // Account Details
        System.out.println("\nStarting ATM Machine");
        System.out.println("Welcome to the ATM Machine");
        System.out.println("\nCustomer Id: 9958\nPIN: 3345");

        // Input the Account Details
        System.out.print("Enter your Customer ID: ");
        int cust = input.nextInt();
        System.out.print("Enter your PIN Number: ");
        int pin = input.nextInt();

            // Incorrect Customer ID and Pin
        while(cust != 9958 && pin != 3345){
                System.out.println("\nBoth Customer ID and PIN Incorrect........Try Again :");
                System.out.print("Enter your Customer ID: ");
                cust = input.nextInt();
                System.out.print("Enter your PIN Number: ");
                pin = input.nextInt();
                }
            // Incorrect Customer ID
        while(cust != 9958 ){
                System.out.println("\nIncorrect Customer ID........Try Again :");
                System.out.print("PIN Number:- 3345 \n");
                System.out.print("Enter your Customer ID:- ");
                cust = input.nextInt();  
            }
            // Incorrect PIN
        while(pin != 3345 ){
                System.out.println("\nIncorrect PIN........Try Again :");
                System.out.print("Customer ID:- 9958\n");
                System.out.print("Enter your PIN Number:- ");
                pin = input.nextInt();
            }
            
            // Select Account Type
            System.out.println("Select the Account Type ");
            System.out.println("Type 1: Saving Account");
            System.out.println("Type 2: Current Account");
            System.out.println("Type 3: Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            // Invaild Choice
            while(choice !=1 && choice != 2 && choice != 3){
                System.out.println("Invaild Choice");
                System.out.print("Choice: ");
                choice = input.nextInt();
            }
            // Menu
            switch (choice) {
                    case 1,2:{ 
                        System.out.println("welcome Ajay Negi");
                        System.out.println("Type 1: Account Details");
                        System.out.println("Type 2: View Balance");
                        System.out.println("Type 3: Withdrawal Funds");
                        System.out.println("Type 4: Deposit Funds");
                        System.out.println("Type 5: Exit");
                        System.out.print("Choice: ");

                        //get choice from user 
                        choice = input.nextInt();

                        //Invaild Choice
                        while(choice !=1 && choice != 2 && choice != 3 && choice != 4 && choice != 5){
                            System.out.println("Invaild Choice");
                            System.out.print("Choice: ");
                            //get choice from user 
                            choice = input.nextInt();}
                            
                        // Sub-Menu
                        switch (choice) {
                            case 1: {//Account Details
                                            System.out.println("Type 1: Account Details");
                                            break;}

                            case 2: {//View Balance
                                            System.out.println("You Enter:- 2 View Balance");
                                            System.out.println("Balance:- "+ b);
                                            break;}

                            case 3: {//Withdrawal Funds
                                    System.out.println("You Enter:- 3 Withdrawal Funds");
                                    System.out.print("Enter the Withdrawal Amount:-  ");

                                    //get the withdrawl money from user
                                    w = input.nextInt();

                                    //check whether the balance is greater than or equal to the withdrawal amount
                                    while(w>b){  
                                        System.out.println("Insufficient Balance");
                                        System.out.print("Enter correct Withdrawal Amount:-  ");
                                        //get the withdrawl money from user
                                        w = input.nextInt(); 
                                        }
                                    //remove the withdrawl amount from the total balance
                                    b = b-w;
                                    System.out.println("Current Balance:- "+b);
                                    System.out.println("Please collect your money.\nThanks For Visiting");
                                    break;}

                            case 4: {//Deposit Funds
                                    System.out.println("You Enter:- 4 Deposit Funds");
                                    System.out.print("Enter the Deposit Amount:-  ");
                                    //get deposit amount from the user
                                    d = input.nextInt();

                                    //add the deposit amount to the total balanace 
                                    b = b+d;
                                    System.out.println("Your Money has been successfully depsited\nCurrent Balance:- "+b);
                                    break;}

                            case 5:{//Exit
                                    System.out.println("You Enter:- 5\nExit ");
                                    break;}}
                   break; } 
                    case 3:{ 
                        System.out.println("You Enter:- 3\nExit ");
                        break;}
                        
                } 
    }
}   