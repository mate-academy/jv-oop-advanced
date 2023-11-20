package core.basesyntax.figures;

import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Draw;

public class Circle extends Figure implements Area, Draw {
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
    public void draw() {
        System.out.println("Circle{color: "
                + getColor()
                + "; radius: "
                + radius
                + "; area: "
                + getArea()
                + "}");
    }
}
