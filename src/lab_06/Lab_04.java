package lab_06;

public class Lab_04 {
    public static void main(String[] args) {
        String url = "https://google.com";
        String a1 = "https:";
        String a2 = "http:";
        String a3 = ".com";
        String a4 = ".vn";
        //Protocol
        if (url.contains(a1) == true) {
            System.out.print("Protocol is:");
            System.out.println("https");
        }
        if (url.contains(a2) == true) {
            System.out.print("Protocol is:");
            System.out.println("http");
        }
        //SubDomain
        if (url.contains(a3) == true) {
            System.out.print("SubDomain is:");
            System.out.println(".com");
        }
        if (url.contains(a4) == true) {
            System.out.print("SubDomain is:");
            System.out.println(".vn");
        }
        //Domain
        int a = url.indexOf("//");
        int b = url.lastIndexOf(".");
        System.out.print("Domain is:"+url.substring(a+2, b));
    }
}
