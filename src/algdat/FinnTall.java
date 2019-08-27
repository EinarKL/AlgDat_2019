package algdat;


import java.util.Arrays;

public class FinnTall {

    public static void main(String[] args) {
        int[] a = {12, 34, 2, 87, 17};
        int[] sortertStørst= new int[a.length];
        int[] sortertMinst= new int[a.length];
        int størstTall = a[0];
        int minstTall = a[0];
        int antallStørreTall = 0;
        int antallLavereTall = 0;

        for (int i = 1; i < a.length; i++) {
            int t = i - 1;
            if (a[i] > størstTall) {
                størstTall = a[i];
                sortertStørst[t] = størstTall;
                antallStørreTall++;
            }
            t++;
        }
        System.out.println("Det største tallet er: " + størstTall);

        for (int i = 1; i < a.length; i++) {
            int t = i - 1;
            if (a[i] < minstTall) {
                minstTall = a[i];
                sortertMinst[t] = minstTall;
                antallLavereTall++;
            }
            t++;
        }
        System.out.println("Det minste tallet er: " + minstTall);

        System.out.println("Antall tall som er større enn alle tall foran er: " + antallStørreTall);

        System.out.println("Antall tall som er lavere enn alle tall foran er: " + antallLavereTall);

        System.out.println("Sortert etter størst: " + Arrays.toString(sortertStørst));

        System.out.println("Sortert etter minst: " + Arrays.toString(sortertMinst));

    }

}