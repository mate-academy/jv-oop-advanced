package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        String[] colors = new String[]{
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "dark blue",
                "purple"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
