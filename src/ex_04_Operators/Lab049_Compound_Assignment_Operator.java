package ex_04_Operators;

public class Lab049_Compound_Assignment_Operator
{
    public static void main(String[] args) {
        System.out.println("It consists  +=  , -= . /= , *= ");
        int age= 20;
        age = age +20; // we can also use  a+=20
        System.out.println(age);

        age*=3;
        System.out.println(age);
    }
}
