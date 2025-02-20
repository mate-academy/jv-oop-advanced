package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String randomColor;
        Random random = new Random();
        String[] colors = {"white", "black", "yellow", "red", "blue"};
        int randomIndex = random.nextInt(colors.length);
        randomColor = colors[randomIndex];
        return randomColor;
    }
}

