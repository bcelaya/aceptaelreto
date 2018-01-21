import java.util.Scanner;
public class tendenciaalladooscuro {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int contador = 0;
        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos ;i++){
            int midiclorianos = sc.nextInt();
            sc.nextLine();
            String base5 = Integer.toString(midiclorianos,5);
            for (int x = 0; x<base5.length();x++){
                if (base5.charAt(x)=='4') {
                    contador += 1;
                }
            }
        if (contador>=2){
                System.out.println("SI");
        }
        else{
                System.out.println("NO");
        }
        contador = 0;
        }
    }
}
