package core.basesyntax.figureshapes;

import core.basesyntax.Figure;
import core.basesyntax.FigureArea;

public class Circle extends Figure implements FigureArea {
    private int radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: cirle, area: "
                + calculateArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }
}
