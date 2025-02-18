package ex_06_Ternary_Operator;

public class Lab062_TO
{
    public static void main(String[] args) {
        System.out.println("### Ternary Operator\n" +
                "- The **conditional operator**, commonly known as the **ternary operator** in Java.\n" +
                "- evaluate a condition and return one of two values based on the result.\n" +
                "- Very similar - `if-else` statement.\n" +
                "\n" +
                "\n" +
                "#### Syntax\n" +
                "- result = condition ? expression1 : expression2;\n");
        int age = 18;
         String can_vote = age>=18 ? "Yes,U can Vote" : "No, u cnt vote";
        System.out.println(can_vote);
    }
}
