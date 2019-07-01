//File Name : IterLine.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class IterLine {
  public void Search() throws IOException {
    String[] list;
    String  search;
    int choice;
        //String  search;

    Scanner input = new Scanner(System.in);
   
    String word = ""; int val = 0;
    while(!word.matches("quit"))
    {
        //System.out.println("Which List Do you Wnat to Search in ?\n1: myRecordFile\n2: MonthlyContributionFile\n3: ChangeTypeContributionFile");
        
        String MyChoice =  JOptionPane.showInputDialog("Which File Do you Want to Search in ?\n1: myRecordFile\n2: MonthlyContributionFile\n3: ChangeTypeContributionFile");
        
        choice = Integer.parseInt(MyChoice);
        
        switch(choice){
        
            case 1:
                    
        word =  JOptionPane.showInputDialog("Enter Your AccountNumber: ");
        
        Scanner file = new Scanner(new File("myRecordFile.txt"));

        while(file.hasNextLine())           
        {
            String line = file.nextLine();
            if(line.indexOf(word) != -1)
            {
                
                JOptionPane.showMessageDialog(null,"AccountNumber EXISTS.");
                ReadFile ReadFileObject = new ReadFile();
                            ReadFileObject.myRecordFileView();
                val = 1;
                break;
            }
            else
            {
                val = 0;
                continue;
            }
        }
        if(val == 0)
        {
          
            JOptionPane.showMessageDialog(null,"AccountNumber does NOT exist");
        }
        
        //JOptionPane.showMessageDialog(null,"Enter \ncontinue \nOR \nquit");
            
            word =  JOptionPane.showInputDialog("Enter quit to QUIT \nEnter continue to CONTINUE");
                 break;
                
                
                
                case 2:
                word =  JOptionPane.showInputDialog("Enter Your AccountNumber:");
        
        Scanner file2 = new Scanner(new File("MonthlyContributionFile.txt"));

        while(file2.hasNextLine())           
        {
            String line = file2.nextLine();
            if(line.indexOf(word) != -1)
            {
                
                JOptionPane.showMessageDialog(null,"AccountNumber EXISTS.");
                ReadFileMonthCont monthcontViewObject= new ReadFileMonthCont();
                            monthcontViewObject.MonthlyContributionFileView();
                val = 1;
                break;
            }
            else
            {
                val = 0;
                continue;
            }
        }
        if(val == 0)
        {
          
            JOptionPane.showMessageDialog(null,"AccountNumber does NOT exist");
        }
        
        //JOptionPane.showMessageDialog(null,"Enter \ncontinue \nOR \nquit");
            
            word =  JOptionPane.showInputDialog("Enter quit to QUIT \nEnter continue to CONTINUE");
                 break;
                
               
            case 3:
                word =  JOptionPane.showInputDialog("Enter Your AccountNumber:");
        
        Scanner file3 = new Scanner(new File("ChangeTypeContributionFile.txt"));

        while(file3.hasNextLine())           
        {
            String line = file3.nextLine();
            if(line.indexOf(word) != -1)
            {
                
                JOptionPane.showMessageDialog(null,"AccountNumber EXISTS.");
               
                ReadFileChangeTypeContributionFile ChangeContFileViewObject = new ReadFileChangeTypeContributionFile();
                            ChangeContFileViewObject.ChangeContFileView();
                val = 1;
                break;
            }
            else
            {
                val = 0;
                continue;
            }
        }
        if(val == 0)
        {
          
            JOptionPane.showMessageDialog(null,"AccountNumber does NOT exist");
        }
        
        //JOptionPane.showMessageDialog(null,"Enter \ncontinue \nOR \nquit");
            
            word =  JOptionPane.showInputDialog("Enter quit to QUIT \nEnter continue to CONTINUE");
                 break;
                
                
            default:
                JOptionPane.showMessageDialog(null,"Ooops!!! ... Wrong Choice.");
                word =  JOptionPane.showInputDialog("Enter quit to QUIT \nEnter continue to CONTINUE");
                 break;
        }
       
}
}
}