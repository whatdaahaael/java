/**
 *  Write a program to enter three angles of a triangle .Pass them to a function 
 *  named triangle (int, int, int). The function checks whether thr triangle is 
 *  possible or not. If the triangle is possible then display whether it is an Acute
 *  angle, Right angled or an Obtuse angled triangle otherwise, display “The
 *  triangle is not possible”.
 *  The sum of the three angles of a triangle must be 180.
 *  Obtuse angled : Anyone angle is more than 90 degree.
 *  Acute angled : If all the angles are less than 90 degree.
 *  Right angled : If any one angle equal to 90 degree.
 *
 * Sujan
 * Assignment 3
 */
import java.util.*;
public class A3_Triangle_Angle
{
    static boolean triangles(int a1, int a2, int a3){
        // Checks whether the given angles form a triangle or no
        if((a1+a2+a3)==180){
            return true;
        }
        else
            return false;
    }
    public static void main(String args[]){
        Scanner rinput = new Scanner(System.in);

        System.out.println("Enter a");
        int a=rinput.nextInt();
        System.out.println("Enter b");
        int b=rinput.nextInt();
        System.out.println("Enter c");
        int c=rinput.nextInt();

        if(triangles(a,b,c)){
            // Any angle > 90
            if(a>90 || b>90 || c>90){
                System.out.println("Obtuse Angled");
            }
            // All angle < 90
            else if(a<90 & b<90 & c<90){
                System.out.println("Acute Angled");
            }
            // Any angle == 90
            else if(a==90 || b==90 || c==90){
                System.out.println("Right Angled");
            }
        }
        else{
            System.out.println("Not a triangle");
        }
    }
}