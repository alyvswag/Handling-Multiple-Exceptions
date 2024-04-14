import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eded daxil edin: "); String eded = scanner.next();
//        eded =null; nullpointer exceptionun isliyib islememesin yoxlayirdim
        try {
            if(eded==null){
                throw new NullPointerException("INPUT NULL");
            }
            Integer eded1 = Integer.valueOf(eded);
            System.out.println("daxil edilen eded: " + eded1);
        }
        catch (NumberFormatException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("An unexpected error occurred.");
        }

    }
}