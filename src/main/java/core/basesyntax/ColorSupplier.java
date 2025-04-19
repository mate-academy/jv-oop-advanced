package core.basesyntax;
import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "orange", "pink", "cyan", "grey"};

    public String getRandomColor() {
        Random rand = new Random();
        return COLORS[rand.nextInt(COLORS.length)];
    }
}
