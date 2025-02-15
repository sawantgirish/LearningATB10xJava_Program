package ex_04_Operators;

public class Lab047_Or_and_gate
{
    public static void main(String[] args) {
        // or is given with character of --->  ||
        // AND /Gate is given with the character of ----. &&
        System.out.println("or is given with character of --->  ||");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        System.out.println("AND /Gate is given with the character of ----. &&");
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);
    }
}
