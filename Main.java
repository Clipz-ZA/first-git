
package Question2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        Student firstStudent      = new Student();
        Student secondStudent     = new Student();
        Student thirdStudent      = new Student();
        
        firstStudent.Name         = JOptionPane.showInputDialog("Please enter first student name");
        secondStudent.Name        = JOptionPane.showInputDialog("Please enter second student name");
        thirdStudent.Name         = JOptionPane.showInputDialog("Please enter third student name");
        
        firstStudent.StudentNo    = Student.createStudentNo();//the create student number method is called from the student class
        secondStudent.StudentNo   = Student.createStudentNo();
        thirdStudent.StudentNo    = Student.createStudentNo();
        
        firstStudent.House        = firstStudent.StudentNo.replaceAll("[0-9]","");//the replace all removes the numbers from the student number to leave us with the house
        secondStudent.House       = secondStudent.StudentNo.replaceAll("[0-9]","");//https://www.javatpoint.com/java-string-replaceall
        thirdStudent.House        = thirdStudent.StudentNo.replaceAll("[0-9]","");
        
        JOptionPane.showMessageDialog(null,"SCHOOL HOUSE ASSIGNMENT \n"+
                                           "************************************ \n"+
                                           firstStudent.Name+" was assigned to "+firstStudent.House+" house with student number "+firstStudent.StudentNo+"\n"+
                                           secondStudent.Name+" was assigned to "+secondStudent.House+" house with student number "+secondStudent.StudentNo+"\n"+
                                           thirdStudent.Name+" was assigned to "+thirdStudent.House+" house with student number "+thirdStudent.StudentNo+"\n",
                                           "School House Assignment", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
