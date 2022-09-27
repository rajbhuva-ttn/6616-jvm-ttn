import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.print("Enter text (type 'XDONE' for EXIT): ");
        while(true){
            String text = input.nextLine();
            if ("XDONE".equals(text)){
                break;
            }
            sb.append(text);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
