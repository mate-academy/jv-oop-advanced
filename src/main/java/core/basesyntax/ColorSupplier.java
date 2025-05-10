package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int number = random.nextInt(7) + 1;
        final String[] colors = {"red","orange","yellow","green","light blue","blue","purple"};
        return colors[number - 1];
    }
}
