//File Name : JamiiMain.java
//This is the MAIN CLASS that is EXECUTABLE
//It executes all other classes
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JamiiMain{
    
    public static void main (String[] args) throws IOException{
        
        int choice;
        
        Scanner inputChoice = new Scanner(System.in);
       
        String MyChoice =  JOptionPane.showInputDialog("Enter Your Choice:"
                + " \n1: Insert New Member\n"
                + "2: Enter Monthly Contributions\n"
                + "3: View Stored Files\n"
                + "4: Search Existing Member\n"
                + "5: Iterate Thru' the Lists");
        
        choice = Integer.parseInt(MyChoice);
        
        switch(choice){
        
            case 1:
                //You can insert NEW MEMBER using this class
                //The list of Inserted members is stored in myRecordFile.txt
                StorageFile InsertFileObject = new StorageFile();
                InsertFileObject.InsertFile();
                break;
                
            case 2:
                //Monthly contribution can be done in this class
                // An existing member can continue with his/her membership or change
                //All Members who continue with their current membership are stored in MonthlyContributionFile.txt
                //All Members who change their membership are stored in ChangeTypeContributionFile.txt
                MonthlyCont ContributionsObject = new MonthlyCont();
                ContributionsObject.Contributions();
                break;
            case 3:
                //This class allows one to VIEW the files of Existing members
                //One can either VIEW from myRecordFile, MonthlyContributionFile or ChangeTypeContributionFile.txt
                //One can view one list at a time
                ViewFile ViewObject = new ViewFile();
                ViewObject.View();
                break;
                
            case 4:
                    //This allows one to view the member by inputting his/her Account Number
                IterLine SearchObject = new IterLine();
                SearchObject.Search();
                break;
                    
            case 5:
                    // This class allows one to Iterate thru'the Specific list of Members
                JamiiIterateMain IterateObject = new JamiiIterateMain();
                IterateObject.iterateMain();
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Ooops!!! ... Wrong Choice.");
                break;
        }
        
    } 
}