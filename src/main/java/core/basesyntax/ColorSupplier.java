package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"green", "black", "yellow", "white", "purple", "blue", "pink"};
        Random r = new Random();
        return colors[r.nextInt(0, 6)];
    }
}
