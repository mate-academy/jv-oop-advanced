package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        String[] colors = {"blue", "green", "magenta", "red", "yellow"};
        int pos = random.nextInt(colors.length);

        return colors[pos];
    }
}
