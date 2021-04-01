package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String [] COLORS = new String []
            {"blue", "green", "orange", "purple", "red"};

    public String generateColor() {
        Random random = new Random();
        int position = random.nextInt(COLORS.length);
        return COLORS[position];
    }
}
