package Question2;

public class Student {

    String Name;//Name of the student
    String House;//House of the student
    String StudentNo;//The student number (has to be a combination of house name plus a max of 4 randomly generated numbers)

    
    public static String createHouseValue(){//this method makes use of a random interger to return a house name
        
        int houseValue = (int) (Math.random() * 2);
        
        if(houseValue == 0){
            return "BLUE";
            
        } else{
            
        if(houseValue == 1){
            return "WHITE";
            
        } else{
            return "RED";
            
        }
      }
    }
    
    public static String createStudentNo(){//this method creates a student number by making use of the house value and inserts a number between 1 and 9999 at the end of the house name
        
        int random = (int) (Math.random() * 9998);
        random = (random + 1);
        
        String StudentNo = createHouseValue() + random;
        
        return StudentNo;
    }
   
    
}
