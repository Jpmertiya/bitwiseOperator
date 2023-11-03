package BitwiseOperators;
import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("please enter a number to check either ewven or not");
        int check = st.nextInt();

        if ((check & 1) == 1)
            System.out.println("yes it is odd");
        else
            System.out.println("ys it's even");
            st.close();

    }
}