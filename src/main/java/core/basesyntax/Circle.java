package core.basesyntax;

import core.basesyntax.behavior.Draw;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, String name, double radius) {
        super(color, name);
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units, radius: " + radius + " units, color: " + color);

    }



}
