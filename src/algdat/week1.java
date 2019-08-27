package algdat;

public class week1 {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] values = {9, 17, 11, 4, 8, 32, -19};

        int max_value = findMaximum(values);

        System.out.println("Fant maksimum til å være: " + max_value);
    }

    /*
    Denne funksjonen finner maksimum iet array med tall.
     */
    static int findMaximum(int[] values) {
        int max_value = values[0];

        //Looper over alle tallene vi får inn
        for (int i=0; i<values.length; i++) {
            int value = values[i];

            if (value > max_value){
                max_value = value;
            }
        }

        return max_value;
    }

}