import java.util.Scanner;

/* TASK 2: STUDENT GRADE CALCULATOR */

public class Task2{
    static float sum = 0;
    static char grade = ' ';
    
/* calculating avg of marks */
    static float avg(int[] marks){
        for(int i =0; i<marks.length;i++){
            sum += marks[i];
        }
        float average = sum/marks.length;
        return average;
    }
    /* calcualting grade of students*/
    static char grade(float ans){
        if(ans>85.0){
            grade ='A';
        }
        else if(ans<85.0 && ans>75.0){
            grade ='B';
        }
        else if(ans<75.0 && ans>65.0){
            grade ='C';                
        }
        else if(ans<65.0 && ans>33.0){
            grade='D';
        }
        else{
            grade = 'F';
        }
        return grade;
    }
    public static void main(String args[]){
        int[] mark = new int[6];
        System.out.println("ENTER MARKS(OUT OF 100): ");
        System.out.println("1. Maths,2. ENG,3. Science,4. CS,5. PH.EDU ,6. Social science");
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<mark.length;i++){
            System.out.println("Enter marks: "+" "+i);
            mark[i] = sc.nextInt();
        } 
        float PERCENT =avg(mark);
        char grade_final = grade(PERCENT); 
        System.out.println("TOTAL MARKS OUT OF 600: "+sum); 
        System.out.println("PERCENATGE: "+PERCENT);
        System.out.println("GRADE: "+grade_final);
        

    }
    
}
