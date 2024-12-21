package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        String[]colors = new String[]{"blue","red","black","pink"};
        int index = new Random().nextInt(colors.length);
        return colors[index];
    }
}
