package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    public static String getRandomColor() {
        Color[] values = Color.values();
        int colorCount = Color.values().length;

        Random random = new Random();
        int index = random.nextInt(colorCount);

        return values[index].getName();
    }

    enum Color {
        RED("red"), WHITE("white"), BLACK("black"),
        BLUE("blue"), ORANGE("orange"), GREEN("green"),
        YELLOW("yellow");

        String name;

        Color(String name) {
            this.name = name;
        }

        String getName() {
            return name;
        }
    }
}
