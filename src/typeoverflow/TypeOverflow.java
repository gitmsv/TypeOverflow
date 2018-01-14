/* type overflow */
package typeoverflow;

public class TypeOverflow {

    public static void main(String[] args) {
        byte a = (byte) (127 + 1);
        System.out.println(a); // -128 !!! переполнение

        /*(мин.знач. short (16 bit/2 byte,
          -32768...32767 )) !!! переполнение */
        short b = (short) (32767 + 1);
        System.out.println(b); // -32768

        short x = Byte.MAX_VALUE + 1;
        System.out.println(x); // все ок /*127+1=128*/

        byte y = (byte) x;
        System.out.println(y);  // -128

        byte z = (byte) (129 + x);
        System.out.println(z); // 1

    }

}
