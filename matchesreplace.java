public class matchesreplace{
    public static void main (String[] args) {
        String x = "Hello";
        String y = "Hello Thavasi Hello";
        System.out.println(x.replace("l" , "p"));
        String a = "(?i) hello";
        System.out.println(y.replace ( a  ,"hi"));
        String b = "Hello";
        System.out.println(y.replaceFirst( b , "hi"));
    }
}