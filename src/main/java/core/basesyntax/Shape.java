package core.basesyntax;

import java.util.HashMap;

public abstract class Shape implements Figure {
    HashMap<Integer, String> colors = new HashMap<>();
    String color;

    public Shape() {
        setColors(colors);
        this.color = colors.get((int) Math.random() * (4 - 1) + 1);
    }

    public void setColors(HashMap<Integer, String> colors) {
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");
    }
}
