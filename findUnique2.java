package BitwiseOperators;

import java.util.Arrays;

/**
 * 
 * it's hard code fix this
 * case where number repet n times but there is one number that appear only once
 * 
 */
public class findUnique2 {
    public static void main(String[] args) {
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        int a=ans(arr);
        System.out.println(a);

    }

    private static int ans(int[] arr) {
       String[] a1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            a1[i]=Integer.toBinaryString(arr[i]);
        }
        int sum=0;
        for(int i=0;i<a1.length;i++){
            sum+=Integer.parseInt(a1[i]);
        }
       System.out.println(Arrays.toString(a1));
       String ress="";
       while(sum>0){
        ress+=(sum%10)%3;
        sum/=10;
       }
       System.out.println(new StringBuilder(ress).reverse());
        return Integer.valueOf(new StringBuilder(ress).reverse().toString());
    }
}
