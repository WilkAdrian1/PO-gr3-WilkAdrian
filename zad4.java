public class zad4 {
    public static void main(String[] args) {
        float Saldokonta = 1000;
        for (int i = 1; i <= 3; i++) {
            Saldokonta += Saldokonta * 0.06;
            System.out.println(i + " rok = " + Saldokonta);
        }
    }
}