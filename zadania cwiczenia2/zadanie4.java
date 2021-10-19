import java.util.Scanner;
public class zadanie4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int najw = 0;
        int najm = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(i==1){ najm=y;najw=2;}
            if(y>najw)najw=y;
            if(y<najm)najm=y;
        }
        System.out.print("największa: "+najw+"\nnajmniejsza: "+najm);
    }
}

