public class split{
    public static void main (String[] args) {
        String x = "hello world";
        String y = "[,\\.\\s]";
        String[]z = x.split(y);
        for( String s:z ){
            System.out.println(s);
        }
    }
}