package core.basesyntax.figures;

import core.basesyntax.figures.behaviour.Drawable;
import core.basesyntax.figures.behaviour.State;

public class Circle extends State implements Drawable {//Okrąg
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: Circle, " +
                "radius: " + radius +
                ", color: " + color;
    }
}
