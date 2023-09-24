package core.basesyntax.figures;

import core.basesyntax.figures.behaviour.Drawable;
import core.basesyntax.figures.behaviour.State;

public class Rectangle extends State implements Drawable {//Prostokąt
    private int height;
    private int width;

    public Rectangle(String color, int height, int width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, " +
                "height: " + height +
                ", width: " + width +
                ", color: " + color;
    }
}
