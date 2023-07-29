package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public String getRandomColor() {
        Random random = new Random();
        String[] colors = {"Red","Blue","Black","Yellow","White","Green","Purple"};
        return colors[random.nextInt(colors.length)];
    }
}
