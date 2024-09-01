package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor(){
        String[] color = new String[]{"Black", "Yellow", "Orange", "White", "Purple", "Blue", "Green", "Pink"};
        Random random = new Random();
        int index = random.nextInt(color.length);
        return color[index];
    }
}
