package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
       private static final String[] colors = {"Green", "White", "Blue", "Yelow", "Black", "Red"};
       public String getRandomColorSupplier() {
       Random random = new Random(); // create random.
        return colors[random.nextInt(colors.length)];

    }
}
