package algdat;

import static javax.swing.JOptionPane.showInputDialog;

public class ukesoppgaver1 {

    public static int[] minmaks(int[] a) {

        return a;
    }

    public static long fak(int n){ // metode som regner ut n!

        n = Integer.parseInt(showInputDialog("Skriv inn ønsket n: "));

        for (int i = 0; i < n; i++) {
            n = n * (n - 1);
        }

        return fak(n);
    }

    public static int maks(int[] a)  // versjon 3 av maks-metoden
    {
        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 0
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp >= maksverdi ? sist : m;   // er siste størst?
                }
                else
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    public static void main(String[] args) {
        int n = 3;
        int sum = 1;
        for (int i = n; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println(sum);

        int[] a = {1, 2, 3, 4};
        System.out.println(maks(a));

        int[] b = {10, 45, 2};
        System.out.println(maks(b));
    }

}
