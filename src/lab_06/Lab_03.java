package lab_06;

public class Lab_03 {
    public static void main(String[] args) {
        String number = "100 minutes";
        char[] ch = number.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            try {
                int result = Integer.parseInt(String.valueOf(ch[i]));
                System.out.print(result);
            } catch (Exception e) {
            }
        }

    }
}
