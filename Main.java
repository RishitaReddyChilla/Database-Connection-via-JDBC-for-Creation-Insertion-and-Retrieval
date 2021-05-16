
package pkg18bcb0140_java_jdbc;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\t********************************************************");
        System.out.println("\t\t     RISHITA REDDY CHILLA");
        System.out.println("\t\t         18BCB0140");
        System.out.println("\t********************************************************");
        System.out.println("\n\t\tESTABLISHING CONNECTION");
        String url="jdbc:mysql://localhost:3306/JAVA_TH_STUDENTS?SSL=true";
        String user="root";
        String pass="";
        FileOutputStream fO=null;
        try
        {
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,pass);
             Statement stmt = conn.createStatement();
             System.out.println("\t\tCONNECTED SUCCESSFULLY");
             System.out.println("\t_______________________________________________________________________________");
             
             System.out.println("\n\t\tCREATING A TABLE NAMED STUDENT_DETAILS IN THE DATABASE JAVA_TH_STUDENTS");
             //CREATING TABLE STUDENTS
             String sql = "CREATE TABLE STUDENT_DETAILS " + "(name VARCHAR(100) , " + "PHOTO LONGBLOB, "+"register_number VARCHAR(100), " + 
                   "city VARCHAR(100), " + "company_placed VARCHAR(100), " + "salary INTEGER, "+"cgpa FLOAT)"; 
             stmt.executeUpdate(sql);
            System.out.println("\t\tSTUDENT_DETAILS TABLE SUCCESSFULLY CREATED");
            System.out.println("\t_______________________________________________________________________________");
             
            
            //INSERTING STUDENT RECORDS
            
            //STUDENT1 RECORD
            System.out.println("\n\t\tINSERTING RECORDS INTO THE TABLE");  
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT1', ? , '18XXX0001', 'CHENNAI', 'COMMVAULT' , 2060000 ,9.5)");
            InputStream pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT1.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT2 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT2', ? , '18XXX0002', 'HYDERABAD', 'WORK_INDIA' , 4000000 ,9.3)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT2.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT3 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT3', ? , '18XXX0003', 'BENGALURU', 'DE_SHAW' , 3400000 ,8.5)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT3.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT4 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT4', ? , '18XXX0004', 'CHANDIGARH', 'UDAAN' , 3000000 ,9.2)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT4.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT5 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT5', ? , '18XXX0005', 'VISHAKHAPATNAM', 'CISCO' , 2917000 ,9.0)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT5.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT6 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT6', ? , '18XXX0006', 'KOCHI', 'AMAZON' , 2800000 ,8.5)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT6.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT7 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT7', ? , '18XXX0007', 'PUNE', 'SWIGGY' , 2820000 ,9.5)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT7.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT8 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT8', ? , '18XXX0008', 'SHIMLA', 'MORGAN_STANLEY' , 2533000 ,8.2)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT8.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT9 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT9', ? , '18XXX0009', 'SHIRDI', 'CONDENATION' , 2500000 ,9.0)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT9.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT10 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT10', ? , '18XXX0010', 'AMRITSAR', 'APPDYNAMICS' , 2200000 ,8.4)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT10.png");
            pstmt.setBlob(1,pic);
            pstmt.execute();
            
            //STUDENT11 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT11', ? , '18XXX0011', 'COIMBATORE', 'MICROSOFT' , 4130000 ,9.5)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT11.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT12 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT12', ? , '18XXX0012', 'DEHRADUN', 'INDIAN_OIL' , 1730000 ,8.9)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT12.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
            //STUDENT13 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT13', ? , '18XXX0013', 'TIRUPATI', 'PAYPAL' , 1200000 ,8.5)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT13.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
            
             //STUDENT14 RECORD
            pstmt = conn.prepareStatement("INSERT INTO STUDENT_DETAILS VALUES('STUDENT14', ? , '18XXX0014', 'SURAT', 'WELLS_FARGO' , 2000000 ,9.0)");
            pic = new FileInputStream("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_PHOTOS\\STUDENT14.png");
            pstmt.setBlob(1, pic);
            pstmt.execute();
        
         System.out.println("\t\tSUCCESSFULLY INSERTED ALL THE RECORDS");
         
         System.out.println("\t_______________________________________________________________________________");
         System.out.println("\n\t\tDETAILS OF STUDENT WITH HIGHEST PACKAGE\n");
         
         //SELECTING HIGHEST PACKAGE STUDENT
         String QUERY = "SELECT name,PHOTO, register_number, city, company_placed, salary,cgpa FROM STUDENT_DETAILS WHERE salary = (SELECT salary from STUDENT_DETAILS as a ORDER BY salary DESC LIMIT 0,1)";
         ResultSet rs = stmt.executeQuery(QUERY);
         
          byte picture[];
          Blob blob;
          int i=1;
         while(rs.next())
         {
            //DISPLAYING HIGHEST SALARY RECORD 
            System.out.println("\t\tNAME: " + rs.getString("name"));
            System.out.println("\t\tREGISTERATION NUMBER : " + rs.getString("register_number"));
            System.out.println("\t\tCITY: " + rs.getString("city"));
            System.out.println("\t\tCOMPANY PLACED: " + rs.getString("company_placed"));
            System.out.println("\t\tSALARY: " + rs.getInt("salary"));
            System.out.println("\t\tCGPA: " + rs.getFloat("cgpa"));
            i++;
             System.out.println("\t_______________________________________________________________________________");
            //RETRIVING THE PHOTO OF STUDENT WITH HIGHEST RECORD TO FOLDER
            File f=new File("E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_WITH_HIGHEST_PACKAGE_PHOTOS\\" + rs.getString("name") + ".jpg");
            fO=new FileOutputStream(f);
            blob=rs.getBlob("PHOTO");
            picture=blob.getBytes(1,(int)blob.length());
            fO.write(picture);
            System.out.println("\n\t\t\tFILE SUCCESSFULLY SAVED IN THE LOCATION\n\t\t"+" E:\\3. JAVA LAB\\JAVA JDBC\\STUDENTS_WITH_HIGHEST_PACKAGE_PHOTOS\\");
            System.out.println();
         }
        }
        catch(Exception e)      
        {
                    
            System.out.println(e);
               
        }
    }
    
}