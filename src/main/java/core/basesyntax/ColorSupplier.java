package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        //Color.values()[index] pobiera stałą enum o wygenerowanym losowo indeksie
        Color color = Color.values()[index];
        return color;
    }
}
