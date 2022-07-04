package core.basesyntax;

import java.util.Random;

public interface ColorSupplier {
    default String getRandomColor() {
        int index = (int)(Math.random() * Color.values().length);
        return Color.values()[index].toString();
    }
}