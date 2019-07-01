//File Name : JamiiIterateContChange.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class JamiiIterateContChange{
    Scanner input = new Scanner(System.in);
public void contChange() throws FileNotFoundException
{
    String fileName = "ChangeTypeContributionFile.txt";
   
    String myChoice =  JOptionPane.showInputDialog("Enter Account Number to delete:");
         String findNumber = myChoice;
    File file = new File(fileName);
    Scanner dataText = null;
    String result="";

    try
    {
        dataText = new Scanner(file);
        while (dataText.hasNext())
        {
            String line = dataText.nextLine();
            if (line.contains(findNumber))
            {
                //System.out.println(line);
                //line.trim();
                //System.out.println(items[1]);
                System.out.println(line);

                result ="done";
            }
        }
    }
   catch (NumberFormatException nfe)
    {
        result = "error";
    }
    catch (NoSuchElementException nsf)
    {
        result = "error";
    }
    catch (FileNotFoundException fnf)
    {
        result = "error";
    }

   // return result;
}
}