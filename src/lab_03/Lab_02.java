package lab_03;

public class Lab_02 {
    public static void main(String[] args) {
        int[]intArr=new int[]{1,2,3,4,5};
        int minNumber= intArr[0];
        int maxNumber= intArr[0];
        for (int i=0;i<intArr.length;i++){
            if(intArr[i]<minNumber){
                minNumber=intArr[i];
            }
            if(intArr[i]>maxNumber){
                maxNumber=intArr[i];
            }
        }
        System.out.print("Min:"+ minNumber+"\n");
        System.out.print("Max:"+maxNumber);
    }
}
