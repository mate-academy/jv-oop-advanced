package core.basesyntax;

import java.awt.*;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }
}
