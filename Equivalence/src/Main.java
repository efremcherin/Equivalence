import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("Inserire la prima lista di reali (separati da una virgola):");
        String firstString = scanner.nextLine();
        System.out.println("Inserire la seconda lista di reali (separati da una virgola):");
        String secondString = scanner.nextLine();

        double[] firstDoubleArray = toDoubleArray(firstString.split(","));
        double[] secondDoubleArray = toDoubleArray(secondString.split(","));

        BagOfDoubles firstMultiset = new BagOfDoubles(firstDoubleArray);
        BagOfDoubles secondMultiset = new BagOfDoubles(secondDoubleArray);

        System.out.println("\nFirstMultiset = " + firstMultiset);
        System.out.println("SecondMultiset = " + secondMultiset + "\n");

        if (firstMultiset.equals(secondMultiset)) {
            System.out.println("Sono equivalenti!");
        } else {
            System.out.println("Non sono equivalenti!");
        }
    }

    private static double[] toDoubleArray(String[] str) {
        if (str[0] == null || str[0].equals("")) {
            return null;
        }
        double[] result = new double[str.length];
        for (int i = 0; i < str.length; i++) {
            result[i] = Double.parseDouble(str[i]);
        }
        return result;
    }

}
