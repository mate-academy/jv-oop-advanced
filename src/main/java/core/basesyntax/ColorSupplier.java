package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
       protected static final String[] colors = {"Green", "White", "Blue", "Yelow", "Black", "Red"};
       protected String getRandomColorSupplier() {
           Random random = new Random();
           return colors[random.nextInt(colors.length)];

    }
}
