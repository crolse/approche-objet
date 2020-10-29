package utils;

public class ConversionNombre {
    static String entierString = "5" ;
    static int entierInt ;
    static int a = 20;
    static int b = 21;




    public static void main(String[] args) {
        entierInt = Integer.parseInt(entierString) ;
        System.out.println(entierInt);
        System.out.println(" le plus grand = " + Math.max(a, b));
    }
}
