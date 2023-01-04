package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
Random random = new Random();

    public String getRandomColor(){
        String [] colors = {"Yellow","Black","White","Green"};
        int colornumber = random.nextInt(colors.length);
        return colors[colornumber];
    }
}
