package ex_04_Operators;

public class Lab041_Logical_Operators
{
    /*1. **Logical Operators ->  (Digital Electronics)**
1-  `&&`  (AND)
2-  `||`  (OR)
3 - `!`  (NOT)
*/
    public static void main(String[] args)
    {
         boolean a=true;
        System.out.println(!a);

        boolean n= false;
        System.out.println(!!!n);

        boolean c= true || false ;
        boolean d= false && false ;
        System.out.println(c);
        System.out.println(d);
    }
}
