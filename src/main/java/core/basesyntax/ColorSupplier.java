package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"red", "green", "blue", "yellow", "orange", "purple", "white", "black"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
