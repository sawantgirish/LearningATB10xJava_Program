package ex_05_Type_Casting;

public class Lab060_Typecasting
{
    public static void main(String[] args) {
         long ph_number = 235345466;
       //  short s = ph_number; // here implicit is not possible
        short s = (short)ph_number;// here Explicit is possble
    }
}
