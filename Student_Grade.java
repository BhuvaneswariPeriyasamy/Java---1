import java.util.Scanner;

public class Student_Grade {

    public static void main(String[] args) {

        Scanner studentName = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String stu_name = studentName.nextLine();

        Scanner stuMark1 = new Scanner(System.in);
        System.out.println("Enter student mark1: ");
        int studentMark1 = stuMark1.nextInt();
        Scanner stuMark2 = new Scanner(System.in);
        System.out.println("Enter student mark2: ");
        int studentMark2 = stuMark2.nextInt();
        Scanner stuMark3 = new Scanner(System.in);
        System.out.println("Enter student mark3: ");
        int studentMark3 = stuMark3.nextInt();

        Scanner attPercentage = new Scanner(System.in);
        System.out.println("Enter student attendance percentage: ");
        int studentPercentage = attPercentage.nextInt();

        int studentAvg = ( studentMark1 + studentMark2 +studentMark3 ) / 3 ;

        if ( studentAvg > 90 && studentPercentage > 85 ){

            System.out.println("Student " + stu_name + " Grade is  A" );
        } else if ( ( studentAvg >= 80 && studentAvg <= 89) &&  studentPercentage > 75 )  {
            System.out.println("Student " + stu_name + " Grade is  B" );
        } else if (( studentAvg >= 70 && studentAvg <= 79) &&  studentPercentage > 65  ) {
            System.out.println("Student " + stu_name + " Grade is  C" );

        }else {
            System.out.println("Student " + stu_name + " Grade is  D" );
        }

    }
}
