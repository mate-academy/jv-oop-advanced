package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor() {

        String [] colors = new String[] {"Yellow", "Brown", "Black", "Red",
                "Green", "Blue"};
        Random random = new Random();
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}
