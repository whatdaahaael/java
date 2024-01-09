/**
 * References
 * Game Board = Double Dimension Array
 *
 */
import java.util.*;
public class TicTacToe {

    final char DEFAULTCHAR='~';
    char arr[][];
    int arrlen, p1score=0, p2score=0;
    char player1, player2;

    /**
     * Initializing the values.
     * Also you can have your own custom player id.
     */
    TicTacToe(int size) {
        Scanner in=new Scanner(System.in);
        arrlen=size;
        arr=new char[arrlen][arrlen];
        System.out.print("Enter player 1 id: ");
        player1=in.next().charAt(0);
        System.out.print("Enter player 2 id: ");
        player2=in.next().charAt(0);
    }

    /**
     * Sets the defualt values of the items at the postions in the Game Board.
     * This is done bcz u can not have an empty Game Board.
     * Change the default char, by changing the 'DEFAULTCHAR' variable.
     *
     */
    void setdefault() {
        for (int i = 0; i < arrlen; i++) {
            for (int j = 0; j < arrlen; j++) {
                arr[i][j]=DEFAULTCHAR;
            }
        }
    }

    /**
     * Prints the Game Board.
     * Simply so that you don't have to use excessive for loops for printing the
     * Game Board.
     *
     * @param
     * @return
     */
    void print() {
        for (int i = 0; i < arrlen; i++) {
            for (int j = 0; j < arrlen; j++) {
                System.out.print(arr[i][j]);
                // Does not print the whole row only till the second last column
                if(j!=arrlen-1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
        // Little spacing after the printing of the Game Board.
        System.out.println("\n\n\n\n");
    }

    /**
     * Checks if the row and column number entered by the user is not already occupied
     * by another players id and that it is still the 'DEFAULTCHAR'
     *
     * @param row array row
     * @param col array col
     * @return true or false
     */
    boolean isfirstinput(int row, int col) {
        if(arr[row][col]!=player1||arr[row][col]!=player2&&arr[row][col]==DEFAULTCHAR) {
            return true;
        }
        else
            return false;
    }

    /**
     * This function accepts the player input and the row and column number.
     *
     * <p>It also calls 'isfirstinput' method so that to ensure that no cheat is detected.
     * Even if the user enter the value it performs recurion to itself so that the user,
     * even if enter a invalid id, calls back again.
     *
     * <p>Note:
     * <p>It stops running entirely if the user enters a number out of the range of
     * the Game Board.
     * <p>It also uses Normal Positioning, starting from 1.
     *
     * @return The user id, but in 'char' form
     */
    char setvalatpos() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter "+player1+" or "+player2+", followed by a space and the postions seperated by a comma\neg: "+player1+" 1,2");
        System.out.println("Uses normal postion");
        String vap=in.nextLine();
        // Eg:      x 2,3
        char chval=DEFAULTCHAR;
        int row=Integer.parseInt(String.valueOf(vap.charAt(2)))-1;// 2
        int col=Integer.parseInt(String.valueOf(vap.charAt(4)))-1;
        try{
            arr[row][col]=DEFAULTCHAR;
        } catch(IndexOutOfBoundsException iot) {
            System.out.println("Enter valid values.");
            setvalatpos();
        }
        
        // This is default bcz if the user enters invalid, it should remain unchanged
        // and it needs to have an initialized value.
        
        if(isfirstinput(row, col)) {
            arr[row][col]=vap.charAt(0);
        }
        else {
            System.out.println("Cannot change value. "+chval+" is already here.\nEnter Again.");
            // Recursion
            setvalatpos();
        }
        return vap.charAt(0);
    }

    /**
     * Checks if there is any match in the rows.
     *
     * @return true or false
     */
    boolean checkrows() {
        for (int i = 0; i < arrlen; i++) {
            if(arr[i][0]!=DEFAULTCHAR) {
                if (arr[i][0] == arr[i][1]) {
                    if (arr[i][1] == arr[i][2]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Checks if there is any match in the columns.
     *
     * @return true or false
     */
    boolean checkcols() {
        for (int i = 0; i < arrlen; i++) {
            if(arr[0][i]!=DEFAULTCHAR) {
                if (arr[0][i] == arr[1][i]) {
                    if (arr[1][i] == arr[2][i]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Checks if there is any match in the diagonal, backslash '\'.
     *
     * @return true or false
     */
    boolean checkbksl() {
        //backslash
        int i=0;
        if(arr[i][i]!=DEFAULTCHAR) {
            if(arr[i][i]==arr[i+1][i+1]){
                if(arr[i][i]==arr[i+2][i+2]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Checks if there is any match in the diagonal, forward slash '/'.
     *
     * @return true or false
     */
    boolean checkfwsl() {
        int i=0;
        if(arr[i][i+2]!=DEFAULTCHAR) {
            if(arr[i][i+2]==arr[i+1][i+1]){
                if(arr[i+1][i+1]==arr[i+2][i]){
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Once the game is over, this method runs to check if the user wants to play again
     *
     */
    void playagain() {
        Scanner in=new Scanner(System.in);
        System.out.println("Do you want to play again? yes/no");
        String choice = in.next();
        if(choice.equalsIgnoreCase("yes")) {
            start_game();
        }
    }

    /**
     * Initializes The defualt values and prints the Game Board
     */
    void initialize() {
        setdefault();
        print();
    }

    /**
     * Starts the game to assign the user entered values.
     *
     * <p>Calls:
     * <p>'setvalatpos()': checks the user entered value and returns char.
     * <p>'print()': this is to refresh the Game Board
     * <p>'checkrows()': checks the rows
     * <p>'checkcols()': checks the columns
     * <p>'checkbksl()': check diagonal backslash '\'
     * <p>'checkfwsl()': check diagonal forward slash '/'
     * 
     */
    void setvalues() {
        char winner=' ';
        boolean result=false;
        for (int i = 0; i < arrlen*arrlen; i++) {
            char player=setvalatpos();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            print();
            if (checkrows()){
                System.out.println("Found row");
                winner=player;
                result=true;
                break;
            }
            else if (checkcols()) {
                System.out.println("Found col");
                winner=player;
                result=true;
                break;
            }
            else if (checkbksl()) {
                System.out.println("Found \\ ");
                winner=player;
                result=true;
                break;
            }
            else if (checkfwsl()) {
                System.out.println("Found / ");
                winner=player;
                result=true;
                break;
            }
        }
        if(result) {
            System.out.println(winner+" wins.");
            if(winner==player1){
                p1score++;
            } else p2score++;
        } else {
            System.out.println("Draw");
        }

        System.out.println(player1+"\t"+player2);
        System.out.println(p1score+"\t"+p2score);
        playagain();
    }

    /**
     * Starts the game by calling 'initialize()' and 'setvalues()'
     *
     */
    void start_game() {
        initialize();
        setvalues();
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Creating Object of the class.
        TicTacToe obj=new TicTacToe(3);
        obj.start_game();
    }
}
