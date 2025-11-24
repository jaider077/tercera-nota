public class StringTerminaCon {
    
    public static boolean terminaCon(String str, String ending) {
        return str.endsWith(ending);
    }
    
    public static void main(String[] args) {
        System.out.println(terminaCon("abc", "bc"));      // true
        System.out.println(terminaCon("abc", "d"));       // false
        System.out.println(terminaCon("hello", "lo"));    // true
        System.out.println(terminaCon("hello", "he"));    // false
        System.out.println(terminaCon("test", "st"));     // true
        System.out.println(terminaCon("code", ""));       // true
    }
}