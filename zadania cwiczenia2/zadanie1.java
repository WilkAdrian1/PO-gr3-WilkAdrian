import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
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
            wynik+=y;
        }
        System.out.print("Wynik z dodawania: "+wynik);
    }
}
zadanie 1b
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        System.out.print("\nWpisz 1 liczbe: ");
        wynik = scan.nextInt();
        for(int i =2;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            wynik*=y;
        }
        System.out.print("Wynik z mnożenia: "+wynik);
    }
}
zadanie 1c
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
            wynik+=abs(y);
        }
        System.out.print("Wynik z dodawania: "+wynik);
    }
}
zadanie 1d
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        double y;
        for(int i =1;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = sqrt(abs(scan.nextInt()));
            wynik+=y;
        }
        System.out.print("Wynik z dodawania: "+wynik);
    }
}
zadanie 1e
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        System.out.print("\nWpisz 1 liczbe: ");
        wynik = abs(scan.nextInt());
        for(int i =2;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            wynik*=abs(y);
        }
        System.out.print("Wynik z mnożenia: "+wynik);
    }
}
zadanie 1f
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
            wynik+=pow(y,2);
        }
        System.out.print("Wynik z mnożenia: "+wynik);
    }
}
zadanie 1g
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik1 = 0;
        int wynik2 = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        System.out.print("\nWpisz 1 liczbe: ");
        y = scan.nextInt();
        wynik1+=y;
        wynik2+=y;
        for(int i =2;i <= x;i++){

            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            wynik1+=y;
            wynik2*=y;
        }
        System.out.print("Wynik z dodawania: "+wynik1+", wynik z mnożenia: "+wynik2);
    }
}
zadanie 1h
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
            if(i%2==0)wynik-=y;
            else wynik+=y;
        }
        System.out.print("Wynik z dodawania: "+wynik);
    }
}
zadanie 1i
public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wynik = 0;
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        int silnia = 1;
        for(int i =1;i <= x;i++){

            silnia*=i;
            System.out.print("\nWpisz "+i+" liczbe: ");
            y = scan.nextInt();
            if(i%2==0)wynik+=y/silnia;
            else wynik-=y/silnia;
        }
        System.out.print("Wynik z dodawania: "+wynik);
    }
}