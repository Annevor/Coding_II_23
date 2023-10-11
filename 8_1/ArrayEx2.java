public class ArrayEx2 {
    
    public static void main(String args[]) {
        String[] browsers = new String[4];
        browsers[0] = "Edge";
        browsers[1] = "Chrome";
        browsers[2] = "OperaGX";
        browsers[3] = "Firefox";
        System.out.println( "size of array: " + browsers.length );
        for( String browser : browsers ){
            System.out.println(browser);
        }
        
    }
    
}
