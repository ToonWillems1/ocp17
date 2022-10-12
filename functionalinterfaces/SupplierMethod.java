package functionalinterfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierMethod {
    public static void main(String[] args) {
        Supplier<StringBuilder> s1 = StringBuilder::new; //method reference
        Supplier<StringBuilder> s2 = () -> new StringBuilder(); //lamda

        System.out.println(s1.get());   //Empty String
        System.out.println(s2.get());   //Empty String

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1); //[]    
    }
}
