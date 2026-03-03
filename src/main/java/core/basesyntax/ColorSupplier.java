package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {
        Random random = new Random();
        String [] colors = new String[] {"Yellow", "Brown", "Black", "Red",
                "Green", "Blue"};
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
