package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index].name();
    }
}
