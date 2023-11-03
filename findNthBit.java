package BitwiseOperators;

public class findNthBit {
    public static void main(String[] args) {
        int n=2;
        int number=18;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(ans(number,n)>>n-1);    
    }

    private static int ans(int number, int n) {
       return (number&(1<<n-1));
    }


}
