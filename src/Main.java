import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] values = {6,-2,5,7,36};
        int [] erotus = new int [values.length-1];

        for(int i = 1; i < values.length; i = i + 1)
        {
            erotus[i-1] = values[i]-values[i-1];
        }
        System.out.println(Arrays.toString(erotus));
    }
}