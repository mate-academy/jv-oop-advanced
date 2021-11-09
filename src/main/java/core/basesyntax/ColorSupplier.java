package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        int randomIndex = new Random().nextInt(Colors.values().length);
        String randomColor;
        randomColor = "" + Colors.values()[randomIndex];
        return randomColor;
    }
}
