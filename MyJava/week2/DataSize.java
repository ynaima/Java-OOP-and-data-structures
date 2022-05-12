package week2;

public class DataSize {
    public static void main (String args[]){
        System.out.println("min_value: " + Integer.MIN_VALUE);
        System.out.println("max_value: " + Integer.MAX_VALUE);
        System.out.println("bytes " + Integer.BYTES);
        
        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Short.MIN_VALUE);
        System.out.println("max_value: " + Short.MAX_VALUE);
        System.out.println("bytes: " + Short.BYTES);

        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Byte.MIN_VALUE);
        System.out.println("max_value: " + Byte.MAX_VALUE);
        System.out.println("bytes: " + Byte.BYTES);

        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Long.MIN_VALUE);
        System.out.println("max_value: " + Long.MAX_VALUE);
        System.out.println("bytes: " + Long.BYTES);

        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Float.MIN_VALUE);
        System.out.println("max_value: " + Float.MAX_VALUE);
        System.out.println("bytes: " + Float.BYTES);

        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Double.MIN_VALUE);
        System.out.println("max_value: " + Double.MAX_VALUE);
        System.out.println("bytes: " + Double.BYTES);

        System.out.println("-------------------------------------");
        System.out.println("min_value: " + Character.MIN_VALUE);
        System.out.println("max_value: " + Character.MAX_VALUE);
        System.out.println("bytes: " + Character.BYTES);


        System.out.println("-------------------------------------");
        System.out.println("hashcode: " + Boolean.hashCode(true));
        


    }
    
}
min_value: -2147483648
max_value: 2147483647
bytes 4
-------------------------------------
min_value: -32768
max_value: 32767
bytes: 2
-------------------------------------
min_value: -128
max_value: 127
bytes: 1
-------------------------------------
min_value: -9223372036854775808
max_value: 9223372036854775807
bytes: 8
-------------------------------------
min_value: 1.4E-45
max_value: 3.4028235E38
bytes: 4
min_value: 4.9E-324
max_value: 1.7976931348623157E308
bytes: 8
-------------------------------------
min_value:
max_value: ?
bytes: 2
-------------------------------------
hashcode: 1231
