package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
        private final Color[] colors = Color.values();
        private final Random randomColor = new Random();

        public String getRandomColor() {
            return colors[randomColor.nextInt(colors.length)].name().toLowerCase();
        }
    }
