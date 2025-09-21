import java.util.*;
public class inputoutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        System.out.println("length of the array : " + marks.length);
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();
         int percenatge = (marks[0] + marks[1] + marks[2]) / 3;
         System.out.println("score: ");
         System.out.println("physics : " + marks[0]);
         System.out.println("chemistry : " + marks[1]);
         System.out.println("maths : " + marks[2]);
         System.out.println("percentage : " + percenatge);

         marks[2] = 93;
         System.out.println("maths : " + marks[2]);
         marks[1] += 2;
         System.out.println("chemistry : " + marks[1]);
         System.out.println("physics : " + marks[0]);
           percenatge = (marks[0] + marks[1] + marks[2]) / 3;
         System.out.println("percentage : " + percenatge);
         
    }
}
