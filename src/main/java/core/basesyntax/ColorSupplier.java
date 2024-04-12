package core.basesyntax;
import java.util.Random;


class ColorSupplier {
    private final String[] colors = {"red", "blue", "green", "yellow", "orange", "purple"};
    private final Random rand = new Random();

    public String getRandomColor() {
        return colors[rand.nextInt(colors.length)];
    }
}
