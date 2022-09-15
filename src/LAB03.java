public class LAB03 {
    public static void main(String[] args) {
        int[]array= new int[]{12, 34, 1, 16, 28};
        int temp=0;
        System.out.print("Chuoi sau khi duoc sap xep: ");
        for (int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                    System.out.print(array[i]+",");
                }
            }
        }
    }
}
