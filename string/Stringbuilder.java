package string;

public class Stringbuilder {
    public static void main(String[] args) {
       // stringBuilder - if we have to perform some operation on the string ue use stringBuilder.
    // to convert stringBuilder to the string we "str.toString()".

    StringBuilder str = new StringBuilder();

    // adding element at the end of the stringBuilder
    str.append("a");
    str.append("n");
    str.append("k");
    
    // insert element at specipic position
    str.insert(2, "i");

    // removind the element
    str.delete(3,4);
    
    
    System.out.println(str);
    }

}
