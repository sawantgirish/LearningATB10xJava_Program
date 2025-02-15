package ex_04_Operators;

public class Lab040_Relational_Operators
{
    public static void main(String[] args) {
        /*1. **Relational Operators (Used to compare two values.)**
    1. `<`  (Less than)
    2. `<=`   (Less than or equal to)
    3. `>`   (Greater than)
    4. `>=`   (Greater than or equal to)
    5. `==`   (Equal to)
    6. `!=`   (Not equal to) */

        int a=33;
        int b=45;
        boolean c= a>b;
        System.out.println(c);

       int  age_of_om=25;
       int age_of_ch=25;
       boolean result = age_of_om>=age_of_ch;
        System.out.println(result);
    }
}