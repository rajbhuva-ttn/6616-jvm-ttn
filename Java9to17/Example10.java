package Java9to17;

import javax.swing.*;
import javax.swing.event.ListDataEvent;

public class Example10 {
    public static void main(String[] args) {

        System.out.println("REPEAT EXAMPLE");
        String string = "My name is Raj Bhuva!!!";
        System.out.println(string.repeat(3));

        System.out.println("\nTRIM EXAMPLE");
        String whiteSpaceString = "    \n Helllo There     \n";
        System.out.println(whiteSpaceString.trim());

        System.out.println("\nSTRIP EXAMPLE");
        String unicodeSpaceString = "\u2005\u2005helllo There     \n";
        System.out.println("Before Strip = "+unicodeSpaceString);
        System.out.println("After Strip = "+whiteSpaceString.strip());

        System.out.println("\nISBLANK EXAMPLE");
        String isBlankString = "   ";
        System.out.println(isBlankString.isBlank());

        System.out.println("\nINDENT EXAMPLE");
        String s = "This is my sentence.";
        System.out.println(s);
        s=s.indent(10);
        System.out.println(s);
        s=s.indent(-5);
        System.out.println(s);

        System.out.println("\nTRANSFORM EXAMPLE");
        String transformMethod = string.transform(stringTemp ->new StringBuilder(stringTemp).reverse()
                .toString());
        System.out.println(transformMethod);

        System.out.println("\nSTRIP INDENT EXAMPLE");
        String stripString = "    Hello There Strip the Indent";
        stripString = stripString.stripIndent();
        System.out.println(stripString);

        System.out.println("\nTRANSLATE ESCAPES EXAMPLE");
        String str = "\"Hello\\nThere\"";
        System.out.println(str.translateEscapes());

        System.out.println("\nFORMATTED STRING EXAMPLE");
        System.out.println(String.format("I am Raj %s","Bhuva"));
    }
}
