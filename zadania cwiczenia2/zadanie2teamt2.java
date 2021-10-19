import java.util.Scanner;
public class zadanie2teamt2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(y>=0)wynik+=y;
        }
        System.out.print("wynik: "+wynik*2);
    }
}

