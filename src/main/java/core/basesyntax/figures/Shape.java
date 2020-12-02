package core.basesyntax.figures;

import core.basesyntax.RandomNumber;
import java.util.HashMap;

public abstract class Shape {
    protected String color;

    public Shape() {
        this.color = generateColors().get(RandomNumber.getRandomNumber(3));
    }

    public abstract String getColor();

    public abstract double getArea();

    public abstract void draw();

    private static HashMap<Integer, String> generateColors() {
        HashMap<Integer, String> colors = new HashMap<>();
        colors.put(1, "Red");
        colors.put(2, "Green");
        colors.put(3, "Blue");

        return colors;
    }

}
