package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static final String[] COLORS = {"red", "green", "blue", "yellow",
            "orange", "magenta", "cyan", "white"};

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}

