import java.util.ArrayList;  
import java.util.Scanner;    

public class StudentGradeTracker {

    public static void main(String[] args) {
      
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); 
        String input;  
        
       
        System.out.println("Welcome to the Student Grade Tracker!");
        System.out.println("Please enter students' grades (0-100). Type 'done' when finished.");
        
      
        while (true) {
            System.out.print("Enter grade: ");
            input = scanner.next();  
            
           
            if (input.equalsIgnoreCase("done")) {
                break; 
            }
            
           
            try {
                int grade = Integer.parseInt(input);
                
               
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade); 
                } else {
                    System.out.println("Please enter a valid grade between 0 and 100.");
                }
            } catch (NumberFormatException e) {
               
                System.out.println("Invalid input. Please enter a number or 'done' to finish.");
            }
        }
        
       
        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
           
            int sum = 0, highest = grades.get(0), lowest = grades.get(0);
            
           
            for (int grade : grades) {
                sum += grade;
                if (grade > highest) highest = grade;  
                if (grade < lowest) lowest = grade;    
            }
            
           
            double average = (double) sum / grades.size();
            
           
            System.out.println("\nHere is the grade summary:");
            System.out.println("Number of students: " + grades.size());
            System.out.printf("Average grade: %.2f\n", average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        }
        
        
        scanner.close();
    }
}
