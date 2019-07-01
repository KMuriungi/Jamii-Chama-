//File Name : JamiiIterateMain.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JamiiIterateMain {
    
    public void iterateMain() throws FileNotFoundException{
            
                
        int choice;
        
        Scanner inputChoice  = new Scanner(System.in);
       
        String MyChoice =  JOptionPane.showInputDialog("Enter Your Choice:"
                + " \n1: To Iterate Thru' Existing Members' list\n"
                + "2: To Iterate Thru' Monthly Contributions List\n"
                + "3: To iterate Thru' list of Contribution of members who have changed membership");
        
        choice = Integer.parseInt(MyChoice);
        
        switch(choice){
        
            case 1:
                
                JamiiIterateInsert InsertObject = new JamiiIterateInsert();
                InsertObject.insert();
                break;
                
            case 2:
                
                JamiiIterateCont ContObject = new JamiiIterateCont();
                ContObject.cont();
                break;
            case 3:

                JamiiIterateContChange ChangeMembObject = new JamiiIterateContChange();
                ChangeMembObject.contChange();
                break;
            
            default:
                JOptionPane.showMessageDialog(null,"Ooops!!! ... Wrong Choice.");
                break;
        }
        
    }
    
    
}
