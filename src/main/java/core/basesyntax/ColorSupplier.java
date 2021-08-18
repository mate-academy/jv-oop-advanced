package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] color = new String[] {"red", "cyan", "yellow", "blue", "brown", "orange", "pink"};
        Random random = new Random();
        int colorFigure = random.nextInt(color.length);
        return color[colorFigure];
    }
}
