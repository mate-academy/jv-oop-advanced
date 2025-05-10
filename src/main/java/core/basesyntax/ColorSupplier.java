package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color figureColor = Color.values()[index];
        return figureColor.name();
    }
}
