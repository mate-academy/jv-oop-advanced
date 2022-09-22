package suppliers;

import java.util.Random;

import core.basesyntax.model.Color;

public class ColorSupplier {
    //static String[] colors = {"white", "red", "green", "blue", "violet"}; // массив вместо enum

    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length - 1);
        return Color.values()[index].name();
    }
}
