package ex_02_JavaBasics;

public class Lab025_Constants
{
    public static void main(String[] args) {
       int a=10;
       a = a+7;
        System.out.println(a);
        // without final keyword we can change the value of 'a'
        // but if we add Final keywoord then we cannot change the value , for example
        final float pi= 3.14f;
        System.out.print("value of Pi is ->");
        System.out.println(pi);
        System.out.println("Constants Should be final in Nature");

    }
}
