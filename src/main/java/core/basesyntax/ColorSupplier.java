package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static int index = new Random().nextInt(Color.values().length - 1);
    private static String getRandomColor = Color.values()[index].name();

    public static int getIndex() {
        return index;
    }

    public static void setIndex(int index) {
        ColorSupplier.index = index;
    }

    public static String getGetRandomColor() {
        return getRandomColor;
    }

    public static void setGetRandomColor(String getRandomColor) {
        ColorSupplier.getRandomColor = getRandomColor;
    }

}
