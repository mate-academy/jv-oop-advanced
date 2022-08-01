package core.basesyntax;

import java.util.Random;

public class ColorSuplier {
    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        return Color.valueOf(colors[index].toString());
    }
}
