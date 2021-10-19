import java.util.Scanner;
public class zadanie2teamt1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz n: ");
        int x = scan.nextInt();
        int y;
        int tab[] = new int[x];
        for(int i =0;i < x;i++){

            System.out.print("\nWpisz "+(i+1)+" liczbe: ");
            y = scan.nextInt();
            tab[i]=y;
        }
        for(int i = 1;i<x;i++){

            System.out.print(tab[i]+"\n");
        }
        System.out.print(tab[0]);
    }
}