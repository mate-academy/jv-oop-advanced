package core.basesyntax;
import java.util.Random;
public class ColorSupplier {
    public static Random random = new Random();
    private static final Color[] colors = Color.values();

    public static Color getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
