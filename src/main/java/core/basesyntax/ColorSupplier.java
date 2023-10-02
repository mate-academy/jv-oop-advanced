package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "blue", "green", "yellow", "white"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
