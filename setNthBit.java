package BitwiseOperators;

public class setNthBit {
    public static void main(String[] args) {
        int n=2;
        int number=18;
        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(ans(number,n)));    

    }

    private static int ans(int number, int n) {
        int ans=number|(1<<n-1);
       return ans;
    }


}
