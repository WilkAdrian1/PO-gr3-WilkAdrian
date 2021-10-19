import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik0 = 0;
        int wynik1 = 0;
        int wynik2 = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(y==0)wynik0++;
            if(y>0)wynik1++;
            if(y<0)wynik2++;
        }
        System.out.print("dodatnie: "+wynik1+"\nujemne: "+wynik2+"\nrówne zero: "+wynik0);
    }
}

