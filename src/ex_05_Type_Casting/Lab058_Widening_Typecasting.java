package ex_05_Type_Casting;

public class Lab058_Widening_Typecasting {
    public static void main(String[] args) {
         /*#### Widening Casting
- Widening casting, also known as implicit casting, occurs when converting a smaller data type to a larger one.
- This type of casting is performed automatically by the Java compiler and is considered safe because there's no risk of data loss.


#### Implicit Widening
```
byte b = 10;
int a = b; // Valid -> Implicit Casting
```
#### Explicit Widening
Although not necessary, you can also perform explicit widening casting:

```
byte b = 10;
int a1 = (int)b; // Valid -> Explicit Casting
*/
        byte b =10;
        // int a = b; // implicit widening -> Automaticslly Done

        int a = (int )b; // Explict Widening (When we Type something// )
    }
}
