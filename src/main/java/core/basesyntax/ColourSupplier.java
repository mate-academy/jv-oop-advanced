package core.basesyntax;

import java.util.Random;

public class ColourSupplier {

    public static String getRandomColors() {
        String[] colors = new String[]{"blue", "red", "yellow", "white", "black"};
        Random random = new Random();
        int numberOfColors = colors.length;
        int pickColor = random.nextInt(numberOfColors);
        String colorChoice = colors[pickColor];
        return colorChoice;
    }
}
