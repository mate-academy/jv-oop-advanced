package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Colors getRandomColor() {
        Random colorNumber = new Random();
        Colors[] colors = {Colors.RED, Colors.ORANGE, Colors.YELLOW, Colors.GREEN, Colors.CYAN,
                Colors.BLUE, Colors.PURPLE};
        int n = colorNumber.nextInt(colors.length);
        return colors[n];
    }
}
