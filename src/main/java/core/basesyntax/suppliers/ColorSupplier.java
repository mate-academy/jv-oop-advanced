package core.basesyntax.suppliers;

import core.basesyntax.figure.Color;

import java.util.Random;

public class ColorSupplier {
        private final Random random = new Random();

        public String getRandomColor() {
            int colorIndex = new Random().nextInt(Color.values().length - 1);
            return Color.values()[colorIndex].name();
        }
}
