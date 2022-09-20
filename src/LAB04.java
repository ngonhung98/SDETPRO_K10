import jdk.jshell.execution.Util;

import java.util.Arrays;


public class LAB04 {
    public static void main(String[] args) {
        int temp=0;
        int[]array1= {1,12,16,28,34};
        int[]array2= {1,13,16,27,99};
        int array1Length=array1.length;
        int array2Length=array2.length;
        int[] result= new int[array1Length + array2Length];
        System.arraycopy(array1, 0, result, 0, array1Length);
        System.arraycopy(array2, 0, result, array1Length, array2Length);
        System.out.print(" Chuoi sau khi merge la:");
        System.out.println(Arrays.toString(result));
    }
}
