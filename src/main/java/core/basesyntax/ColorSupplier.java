package core.basesyntax;
import java.util.Random;

class ColorSupplier {
    private static final String[] COLORS = {
            "red", "blue", "green", "yellow", "purple", "orange", "pink",
            "black", "white", "gray", "cyan", "magenta"
    };

    private final Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
