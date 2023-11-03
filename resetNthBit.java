package BitwiseOperators;

public class resetNthBit {
    public static void main(String[] args) {
        int n = 5;
        int number = 18;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(ans(n, number)));
    }

    private static int ans(int n, int number) {
        int res = (number & (~1 << n - 1));
        System.out.println(res);
        return res;
    }
}