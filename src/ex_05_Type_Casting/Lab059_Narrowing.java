package ex_05_Type_Casting;

public class Lab059_Narrowing
{
    public static void main(String[] args) {
        int val =200;
        // byte a = val; // here implicit typecasing is not possible
          // here putting value int into byte is not possible as the value/size  of int is larger  than byte
        byte b = (byte)val ;// explicit typecasing is allowed and it works
        // in case of narrowing in this case DATA loss willhappen
    }
}
