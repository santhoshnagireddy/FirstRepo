
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class NoMoneyExceptions extends Exception {

	public NoMoneyExceptions(String mess) {
		super(mess);
		
	}

}

 class Bank {
	
    private String accno;
    private String name;
    private long balance;

     static Scanner KB = new Scanner(System.in);
     
     List al=new ArrayList();
     List al1=new ArrayList();
     

    //method to open an account
    void openAccount() {
        System.out.print("Enter Account No: ");
        accno = KB.next();
        System.out.print("Enter Name: ");
        name = KB.next();
        System.out.print("Enter Balance: ");
        balance = KB.nextLong();
    }

    //method to display account details
    void showAccount() {
        System.out.println(accno + "," + name + "," + balance);
    }

    //method to deposit money
    void deposit()  {
        long amt;
        System.out.println("Enter Amount U Want to Deposit : ");
        amt = KB.nextLong();
      balance = balance + amt;
        al.add(amt);  
    }
        
        
       
        

    //method to withdraw money
    void withdrawal() throws Exception {
        long amt;
        System.out.println("Enter Amount U Want to withdraw : ");
        amt = KB.nextLong();
        try {
        	 if (balance < amt) {
        		 throw new NoMoneyExceptions("no sufficient balance");
        }
        	 else {
        
            balance = balance - amt;
            al1.add(amt);     
   }
    }
        catch(NoMoneyExceptions e) {
        	System.out.println(e);
        }
    }
    
    //method to search an account number
    boolean search(String acc) {
        if (accno.equals(acc)) {
            showAccount();
            return (true);
        }
        return (false);
    }
    
    

	  void TransactionDetials() { 
		  System.out.println("Deposit amount"+al+ "\nWithdraw amount"+al1);
		
	}

}

public class Banking {
    public static void main(String arg[]) throws Exception  {
    	System.out.println("you want how many accounts?");
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        //create initial accounts
        int n=KB.nextInt();
        Bank C[]=new Bank[n];
     
        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n"
            		+ "1. Account creation\n"
            		+ "2. Account Search detials\n"
            		+ " 3. Cash Deposit\n"
            		+ " 4. Cash Withdrawals\n "
            		+ "5.Display Accountdetials\n"
            		+ "6.Transation detials\n"
            		+ " 7.Exit ");
                System.out.println("Ur Choice :"); 
                ch = KB.nextInt();
                switch (ch) {
                
                case 1:
                	 
                	for (int i = 0; i < C.length; i++) {
                        C[i] = new Bank();
                        C[i].openAccount();
                    }
                	break;
                	
                case 2:
                    System.out.print("Enter Account No U Want to Search...: ");
                    String acn = KB.next();
                    String name=KB.next();                    
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(acn);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search Failed..Account Not Exist..");
                    }
                    break; 
                    	 
               
                
                
                    case 3:
                    	System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].deposit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;


                    case 4:
                    	System.out.print("Enter Account No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].withdrawal();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;
                        
                        case 5:
                            for (int i = 0; i < C.length; i++) {
                                C[i].showAccount();
                            }
                            break;

                    case 6:
                    	System.out.println("enter account no::");
                    	acn=KB.next();
                    	for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if(found) {
                            	C[i].TransactionDetials();
                            }
                    	}
                        break;
                        
                    case 7:
                        System.out.println("bye");
                        break;

                    
                }
            }
            while (ch != 6);
        }

	

	
	  
	 
    }
