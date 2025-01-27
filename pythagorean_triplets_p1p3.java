/**
 * Projct 1 Program 3
 *
 *Write a program in Java to display all Pythagorean triplets from 1 to 1000. 
 */
public class pythagorean_triplets_p1p3 
{
    public static void main() {
        int a, b, c ,ctr=0;
        System.out.println("Pythagorean Triplets upto 1000 are:\n");
        for (a = 1; a <= 1000; a++) {
            for (b = a+1; b <= 1000; b++) {
                for (c = 1; c <= 1000; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.print(a + ", " + b + ", " + c);
                        System.out.println();
                        ctr+=1;
                    }
                    else
                        continue;                  
                }
            }
        }
        System.out.println("The total triplets from 1 - 1000 are: "+ctr);
    }
}