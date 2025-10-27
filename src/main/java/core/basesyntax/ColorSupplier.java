package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random rand = new Random();

    public String getRandomColor(){
        Color [] randomColor = Color.values();
        return randomColor[rand.nextInt(randomColor.length)].name();
    }
}
