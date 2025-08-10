package StriverSheet;
import java.util.*;

class Basic1{
    public void studentGrade(int marks) {
        if(marks >= 90) {
            System.out.print("Grade A");
        } else if (marks >= 70) {
            System.out.print("Grade B");
        } else if (marks >= 50) {
            System.out.print("Grade C");
        } else if (marks >= 35) {
            System.out.print("Grade D");
        } else {
            System.out.print("fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks : ");
        int marks = sc.nextInt();

        Basic1 s = new Basic1();
        s.studentGrade(marks);  // ✅ Now this works
    }
}
