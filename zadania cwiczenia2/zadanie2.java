import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
zadanie 2a
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i =1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if (y % 2 == 1) wynik+=1;
        }
        System.out.print("Występuje liczb nieparzystych: "+wynik);
    }
}
zadanie 2b
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i =1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if (y % 3 == 0 && y % 5 != 0) wynik+=1;
        }
        System.out.print("Występuje liczb nieparzystych: "+wynik);
    }
}
zadanie 2c
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(sqrt(y) %2 == 0) wynik++;
        }
        System.out.print("wynik: "+wynik);
    }
}
zadanie 2d
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int tab[] = new int[x];
        for(int i = 1;i < x - 1;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            tab[i] = scan.nextInt();
            if(tab[i] < (tab[i-1]+tab[i+1])/2)wynik++;
        }
        System.out.print("wynik: "+wynik);
    }
}
zadanie 2f
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(i%2==1 && y%2==0)wynik++;
        }
        System.out.print("wynik: "+wynik);
    }
}
zadanie 2g
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(y%2==1 && y>=0)wynik++;
        }
        System.out.print("wynik: "+wynik);
    }
}
zadanie 2h
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        for(int i = 1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(abs(y) < pow(i, 2))wynik++;
        }
        System.out.print("wynik: "+wynik);
    }
}
