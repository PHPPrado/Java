
package programapernas;

import java.util.Scanner;


public class ProgramaPernas {

    public static void main(String[] args) {
        String tipo;
        Scanner quant = new Scanner(System.in);
        int perna = quant.nextInt();
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
            case 4:
                tipo = "Quadrupede";
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
