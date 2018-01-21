import java.util.Scanner;

public class yosoytu {
    public static void main(String args[]){

        int casos = 0;
        Scanner sc = new Scanner(System.in);
        casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i<casos;i++) {
            String nombre = sc.nextLine();
            String parentesco = sc.nextLine();
            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            }
            else {
                System.out.println(nombre + ", " + "yo soy tu " + parentesco);
            }
        }
	sc.close();
    }
}
