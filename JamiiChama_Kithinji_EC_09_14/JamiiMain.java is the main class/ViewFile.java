//File Name : ViewFile.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 


import javax.swing.JOptionPane;

public class ViewFile{
    int choice;
    public void View(){
        
        String MyAmount = JOptionPane.showInputDialog("Enter Your Choice to View:\n1. List of Existing Members \n2. List Of Monthly Contributions \n3. List Of Members Changed Membership");
            
            choice = Integer.parseInt(MyAmount);
            
            switch(choice){
                case 1:
                    ReadFile ReadFileObject = new ReadFile();
                            ReadFileObject.myRecordFileView();
                    break;
                    
                case 2:
                    ReadFileMonthCont monthcontViewObject= new ReadFileMonthCont();
                            monthcontViewObject.MonthlyContributionFileView();
                    break;
                    
                case 3:
                    ReadFileChangeTypeContributionFile ChangeContFileViewObject = new ReadFileChangeTypeContributionFile();
                            ChangeContFileViewObject.ChangeContFileView();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null,"Ooops!!! ... Wrong Choice.");
                    break;
                 
            }
    }
}