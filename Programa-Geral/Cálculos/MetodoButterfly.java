
package metodobutterfly;

import java.util.Scanner;
public class MetodoButterfly {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        int n,nDois,d,dDois,asaLeft,asaRight,butterfly,resultD;
        
        System.out.println("\nPrograma que calcula , o metodo butterfly\n ");
        System.out.println("\nDigite o primeiro numerador:");
        n = ler.nextInt();
        System.out.println("\nDigite o segundo numerador: ");
        nDois = ler.nextInt();
        System.out.println("\nDigite o primeiro denominador:  ");
        d = ler.nextInt();
        System.out.println("\nDigite o segundo denominador: ");
        dDois = ler.nextInt();
        
        asaLeft  = n * dDois ;
        asaRight = d * nDois ;
        butterfly = asaLeft + asaRight ;
        resultD = d + dDois ;
        
        System.out.println("\n "+n+" + "+nDois+" = "+butterfly);
        System.out.println(" "+d+"   "+dDois+"    "+resultD);
    }
    
}