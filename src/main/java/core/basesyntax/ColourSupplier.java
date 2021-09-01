package core.basesyntax;

import java.util.Random;

public class ColourSupplier {
    private String[] colors = new String[]{"blue", "red", "yellow", "white", "black"};

    private Random random = new Random();

    public String getColors() {
        int numberOfColors = colors.length;
        int pickColor = random.nextInt(numberOfColors);
        String colorChoice = colors[pickColor];
        return colorChoice;
    }
}
