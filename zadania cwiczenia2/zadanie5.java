import java.util.Scanner;
public class zadanie5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y[] = new int[x];
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y[i-1] = scan.nextInt();
            if(i!=1){
                if(y[i-2]>0 && y[i-1]>0)wynik++;
            }
        }
        System.out.print("wynik: "+wynik);
    }
}

