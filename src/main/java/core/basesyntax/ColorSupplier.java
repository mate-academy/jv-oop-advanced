package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"blue", "red", "yellow", "green", "orange", "purple"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
