package lab22;

import java.util.Scanner;
 
public class lab22 {
 
       public static void main(String[] args) {
              Scanner reader = new Scanner(System.in); //Making a comment just because 
             
              double length;
              double width;
              double height;
              String resume;
             
              System.out.println("Welcome to the Grand Circus Room Detail Generator!");
              System.out.println( );
              System.out.println("Please enter values of length and width of the classroom");
              
              do {
                     System.out.println("Enter Length: ");
                     length = reader.nextDouble();
                    
                     System.out.println("Enter Width: ");
                     width = reader.nextDouble();
                    
                     System.out.println("Enter Height: ");
                     height = reader.nextDouble();
                     
                     double area = (length * width);
                     System.out.println("Area: " + area);
                    
                     double perimeter = (length * 2 + width * 2);
                     System.out.println("Perimeter: " + perimeter);
                     
                     double volume = (length * width * height);
     				 System.out.println("Volume of the room is: " +volume);
                    
                     System.out.println("Would you like to continue? Y/N ");
                     resume = reader.next();
                    
              } while (resume.equalsIgnoreCase("Y"));
             
       }
 
}
