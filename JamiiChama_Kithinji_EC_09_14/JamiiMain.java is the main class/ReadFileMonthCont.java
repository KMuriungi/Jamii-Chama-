//File Name : ReadFileMonthCont.java
//Its Executed in the main class (JamiiMain.java)
//Original Code by: Kithinji A. Muriungi
//Reg. No. EC/09/14
//kamkith@gmail.com
//@kithinji_muriungi
//JAMII CHAMA SYSTEM 

import java.io.*;



 public class ReadFileMonthCont
 {
    public static void MonthlyContributionFileView() 
    {
       //System.out.println("Reading File from Java code");
       //Name of the file
       String fileName="MonthlyContributionFile.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          String line;

          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
            System.out.println(line);
          }
          //Close the buffer reader
          bufferReader.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

     }
  }