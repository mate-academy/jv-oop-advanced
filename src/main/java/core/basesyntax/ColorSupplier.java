package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private String[] colors = new String[]
            {"BLACK","BLUE", "RED", "WHITE", "GREEN", "YELLOW", "PURPLE", "GREY", "SILVER"};
    private Random random = new Random();
    private int colorQuantity = colors.length - 1;

    public String getRandomColor() {
        return this.colors[random.nextInt(colorQuantity)];
    }
}
