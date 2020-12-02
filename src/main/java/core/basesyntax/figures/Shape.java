package core.basesyntax.figures;

import core.basesyntax.RandomNumber;

import java.util.HashMap;

public abstract class Shape implements Figure {
    protected String color;

    public Shape() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
        this.color = colors.get(RandomNumber.getRandomNumber(3));
    }

}
