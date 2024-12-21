package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = {"Red","Green","Blue","Yellow","Black","Purple"};
        Random random = new Random();
        String randomColor = colors[random.nextInt(colors.length)];
        return randomColor;
    }
}
