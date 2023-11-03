package BitwiseOperators;

public class magicNumber {

    public static void main(String[] args) {

        int n = 2;
       
        System.out.println(magic1(n));
        System.out.println(magic2(n));
    }
    static int magic1(int n){
         String s = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sum += Math.pow(5, i + 1);
            }
        }
        return sum;
    }
    public static int magic2(int n){

        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            ans+=base*last;
            n=n>>1;
            base*=base;
        }
        return ans;
    }
}
