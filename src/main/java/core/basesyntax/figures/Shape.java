package core.basesyntax.figures;

import java.util.HashMap;
import java.util.Random;

public abstract class Shape implements Figure {
    protected Random random = new Random();
    protected String color;

    public Shape() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        this.color = colors.get(random.nextInt(3) + 1);
    }

}
