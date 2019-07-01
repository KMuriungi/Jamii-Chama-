//File Name : MonthlyCont.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MonthlyCont {
    
        String name;
	String id;
        String account;
        int MembCheck;
        String MonthAmount;
        String  accType;
        String newType;
        int confirm;
        int newAccType;
        String gold = "3000";
        String silver = "2000";
        String bronze = "1000";
        String goldG = "Gold";
        String silverS = "Silver";
        String bronzeB = "Bronze";
     
 
       public String msg()
	{
	return name+"     "+id+"     "+account+"     "+accType+"    "+MonthAmount;
	}
       
	public String Contributions(){
           
            
            Scanner inputCont = new Scanner(System.in);
                
                
                String MyChoice =  JOptionPane.showInputDialog("Enter Your Choice :\n1: Continue with Your Current Membership \n2: Change Your Current membership ");
        
                MembCheck = Integer.parseInt(MyChoice);
        
                
		switch (MembCheck){
                    
                    case 1:

                        
                  
                        name = JOptionPane.showInputDialog("Enter Your Name :");
            
                        id = JOptionPane.showInputDialog("Enter Your ID No. :");
            
                        account = JOptionPane.showInputDialog("Enter Your Account Number :");
                        
                        String MyNewAccType =  JOptionPane.showInputDialog("Choose Your Type of Account:\n1. Gold\n2. Silver\n3. Bronze");
        
                        newAccType = Integer.parseInt(MyNewAccType);
        
                        
                        
                        if (newAccType == 1){
                            
                            MonthAmount = gold;
                            
                            accType = goldG;
                        }
                        else if(newAccType == 2){
                            
                            MonthAmount = silver;
                            
                            accType = silverS;
                        }
                        else if (newAccType == 3){
                            
                            MonthAmount = bronze;
                            
                            accType = bronzeB;
                        }   
                        else{
                            JOptionPane.showMessageDialog(null,"Ooops....Wrong Choice Of Membership!!!");
                        }
                       
                        
                        try
                            {
                            FileWriter fw=new FileWriter("MonthlyContributionFile.txt",true);
                            
                            BufferedWriter bw=new BufferedWriter(fw);
                            
                            bw.write(msg());
                            bw.newLine();
                            bw.close();
                            }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                    System.out.println("There is an Error in the Program!!! "+e.getMessage());
                                }
                        
                        JOptionPane.showMessageDialog(null,"				THANK YOU				 \n\nFOR UPDATING YOUR MONTHLY CONTRIBUTION ");
                        break;
                        
                    case 2:
                        
                        
                        String NewAccType =  JOptionPane.showInputDialog("Choose Your Type of Account: \n1. Gold \n2. Silver \n3. Bronze");
        
                        newAccType = Integer.parseInt(NewAccType);
        
                        
                        if (newAccType == 1){
                            
                            MonthAmount = gold;
                            
                            accType = goldG;
                        }
                        else if(newAccType == 2){
                            
                            MonthAmount = silver;
                            
                            accType = silverS;
                        }
                        else if (newAccType == 3){
                            
                            MonthAmount = bronze;
                            
                            accType = bronzeB;
                        }   
                        else{
                           
                            JOptionPane.showMessageDialog(null,"Ooops....Wrong Choice Of Membership!!!");
                        }
                       
                        
                        if (newAccType == 1){
                            //MonthAmount = gold;
                            accType = goldG;
                        }
                        else if(newAccType == 2){
                           // MonthAmount = silver;
                            accType = silverS;
                        }
                        else if (newAccType == 3){
                            //MonthAmount = bronze;
                            accType = bronzeB;
                        }   
                        else{
                            
                            JOptionPane.showMessageDialog(null,"Ooops....Wrong Choice Of Membership!!!");
                        }
                        
                        String MyConfirm =  JOptionPane.showInputDialog("Enter: 1 : To Confirm & Continue");
        
                        confirm = Integer.parseInt(MyConfirm);
        
                        
                        if (confirm == 1){
                         
                        
                       name = JOptionPane.showInputDialog("Enter Your Name :");
            
                        id = JOptionPane.showInputDialog("Enter Your ID No. :");
                        
                        account = JOptionPane.showInputDialog("Enter Your Account Number :");
                        
                        
                        try
                            {
                            FileWriter fw=new FileWriter("ChangeTypeContributionFile.txt",true);
                            
                            BufferedWriter bw=new BufferedWriter(fw);
                            
                            bw.write(msg());
                            bw.newLine();
                            bw.close();
                            }
                                catch(Exception e)
                                {
                                    e.printStackTrace();
                                    
                                    System.out.println("There is an Error in the Program!!! "+e.getMessage());
                                }
                        
                        }
                        
                        else{
                       
                        JOptionPane.showMessageDialog(null,"Ooops!!! Wrong Choice...");
                        }
                        
                        JOptionPane.showMessageDialog(null, "				THANK YOU				 \n\nFOR UPDATING YOUR MONTHLY CONTRIBUTION ");
                        
                        break;
                        
                    default:
                         
                         JOptionPane.showMessageDialog(null,"Ooops!!! Wrong Choice...");
                        break;
                   
                }
            return null;
        }
}
