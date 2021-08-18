package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private String[] colors = new String[]{"red", "green", "blue", "orange", "pink"};
    private String color = colors[random.nextInt(4)];


    public String  getRandomColor() {
        return color;
    }
}
