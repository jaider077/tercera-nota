import java.util.Arrays;

public class Anagrama {

    public static boolean esAnagrama(String palabra1, String palabra2) {

        palabra1 = palabra1.toLowerCase();
        palabra2 = palabra2.toLowerCase();

        if (palabra1.equals(palabra2)) {
            return false;
        }

        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        System.out.println(esAnagrama("roma", "amor"));   
        System.out.println(esAnagrama("hola", "halo"));   
        System.out.println(esAnagrama("casa", "saca"));    
        System.out.println(esAnagrama("perro", "gato"));   
        System.out.println(esAnagrama("somos", "somos"));  
    }
}