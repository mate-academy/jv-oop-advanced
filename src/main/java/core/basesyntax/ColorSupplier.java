package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        Random random = new Random();
        int colorIndex = random.nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}


//    lets make Random as class level variable, not to create new instance of Random class every time
//        we call getRandomColor() method.
//        And lets remove unnecessary comments