package ex_04_Operators;

public class Lab038_Arithematic_Operators
{
    public static void main(String[] args) {
        /* Addition +
           Subtraction -
           multiplication *
           division /
           modulo % (Modulus - to print reminder)
         */

        System.out.println("1. **Arithmetic Operators -> **Used for basic mathematical operations.\n" +
                "    1. `+`   (Addition)\n" +
                "    2. `-`   (Subtraction)\n" +
                "    3. `*`   (Multiplication)\n" +
                "    4. `/`   (Division)\n" +
                "    5. `%`   (Modulo)\n");

        int    a = 20;
        float  b =11.0f;
        float  r = 3.5f;
        System.out.println(a+b); // here a , b are the Operand s and + is an operator
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a*r);
        System.out.println(a/r);
        System.out.println(a+140);
        System.out.println(a+r);

    }
}
