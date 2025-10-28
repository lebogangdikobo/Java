import java.util.Scanner;
public class FindingInitials{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name(s): ");
        String name = scan.nextLine();

        String initials = "";

        initials += Character.toUpperCase(name.charAt(0));

        System.out.print("Enter your surname: ");
        String surname = scan.nextLine();

        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == ' '){
                initials += Character.toUpperCase(name.charAt(++i));
            }
        }

        System.out.println("Your initials and surname are " + initials + " " + surname);

        scan.close();
    }
}