package lab_03;

public class Lab_01 {
    public static void main(String[] args) {
        int countSoLe=0;
        int countSoChan=0;
        int [] arr= new int[]{1, 2, 3, 4, 5};
        for (int i=arr[0];i<arr.length+1;i++){
            //so chan
            if (i%2==0){
                countSoChan++;
            }
            //so le
            else {
                countSoLe++;
            }
        }
        System.out.print("so chan:"+ countSoChan+"\n");
        System.out.print("So le:"+countSoLe);
    }
}
