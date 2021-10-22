package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    public String getRandomColor(){
        Random random = new Random();
        Color[] colors = Color.values();
        int i = random.nextInt(colors.length);
        return colors[i].toString();


    }
}
