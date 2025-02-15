package ex_05_Type_Casting;

public class Lab061_typecasting_uses
{
    public static void main(String[] args) {
        int course_fee = 100;
        float GSt = 18.45f; // if we use narrowing Implicit is not possible on;ly Explicit is Possible
       float total = course_fee + GSt;
        System.out.println(total);

         // if we use
      //  System.out.println("if we use this ");
      //   int total = course_fee + (int)GSt; // Narrow Explicit
        // narrowing in inplicit is not possible
    }

}
