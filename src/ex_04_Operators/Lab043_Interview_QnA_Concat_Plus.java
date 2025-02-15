package ex_04_Operators;

public class Lab043_Interview_QnA_Concat_Plus
{
    public static void main(String[] args) {
        String Firsh_Name = "Girish";
        String Last_name ="Sawant";

        int a=10;
        int b=10;
        System.out.println(Firsh_Name+Last_name +a +b); // here even if we add integers in betten the process will be of concatination insead of mathematical at the end

        System.out.println(" Bcoz the First Operator Has done Concatination the remaning process will follow concatination  (from left to right side )");

        System.out.println(a+b+ Firsh_Name+Last_name );
        System.out.println("Above the first was an integer so it did maths  and after that there was string present so It has done ConCatination");
        System.out.println(Firsh_Name+Last_name+ (a+b));
        System.out.println("If we want to do maths if it has first done concatination then we can simply add ()");

        // BODOMAS= first of all Bracket of div,mul, add and then sub will be done
    }
}
