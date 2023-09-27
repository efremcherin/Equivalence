import java.util.Arrays;

public class BagOfDoubles {

    private double[] doubles;

    public BagOfDoubles(double[] doubles) {
        this.doubles = doubles;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        if (this.doubles == null || ((BagOfDoubles) obj).doubles == null) {
            return false;
        }

        if (this.doubles.length != ((BagOfDoubles) obj).doubles.length) {
            return false;
        }

        Arrays.sort(this.doubles);
        Arrays.sort(((BagOfDoubles) obj).doubles);
        for (int i = 0; i < this.doubles.length; i++) {
            if (this.doubles[i] != ((BagOfDoubles) obj).doubles[i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String result = null;
        if (doubles != null) {
            for (int i = 0; i < doubles.length; i++) {
                result = result + ", " + doubles[i];
            }
        }
        return result;
    }

}