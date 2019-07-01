//File Name : StorageFile.java
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

public class StorageFile 
{
	Person p = new Person();
        Scanner input = new Scanner (System.in);
        MonthlyCont countribution = new MonthlyCont();
        
            String gold="Gold";
            String silver="Silver";
            String bronze="Bronze";
            String nill ="NULL";
                
	public void InsertFile(){
		StorageFile store = new StorageFile();
		for(int i=0;i<1;i++)
			store.start("name" ,"id", "gender", "account", "membership");
		
		JOptionPane.showMessageDialog(null, "THANK YOU \nFOR REGISTERING WITH \nJAMII CHAMA. ");
	}
	public void start(String name,String id,String gender,String account,String membership)
	{
            
            name = JOptionPane.showInputDialog("Enter Your Name :");
            
            id = JOptionPane.showInputDialog("Enter Your ID No. :");
            
            gender = JOptionPane.showInputDialog("Enter Your Gender (MALE/FEMALE) :");
            
            account = JOptionPane.showInputDialog("Enter Your Account Number :");

            String MyAmount = JOptionPane.showInputDialog("Enter Amount for  Type of Your Membership:");
            
            double amount = Double.parseDouble(MyAmount);
            {
              
            if(amount==3000){
               membership = gold;
            }
            
            else if(amount==2000){
               membership = silver;
            }
            else if(amount==1000){
               membership = bronze;
            }
            else {
                membership = nill;
            }
            
            }
                
            
            p.setId(id);
            p.setName(name);
            p.setGender(gender);
            p.setAccount(account);
            p.setMembership(membership);
            
            
		try
		{
		FileWriter fw=new FileWriter("myRecordFile.txt",true);
                
		BufferedWriter bw=new BufferedWriter(fw);
                
		bw.write(p.msg());
		bw.newLine();
		bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("There is an Error in the Program!!! "+e.getMessage());
		}
	}
}


