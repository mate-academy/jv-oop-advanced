package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private String[] colors = {"white", "black", "green", "navy", "yellow", "red", "purple", "orange"};

    public String getRandomColor(){
        Random rnd = new Random();
        return colors[rnd.nextInt(colors.length)];
    }
}
