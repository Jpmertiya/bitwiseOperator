package BitwiseOperators;
public class findUnique {
    public static void main(String[] args) {
        int[] arr={1,4,2,1,6,2,4};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
       int res=0;
        for(int i:arr){
            res ^=i;
        }

       return res;
    }
}
