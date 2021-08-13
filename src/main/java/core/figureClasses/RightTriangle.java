package core.figureClasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;

public class RightTriangle extends Figure {
    private int side;
    private int height;

    public RightTriangle(String name, String color, int side, int height) {
        super(name, color);
        this.side = side;
        this.height = height;
    }

    @Override
    public double area() {
        return side * height / 2;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: " + this.name + ", area: " + area() + " sq.units, side: " + side +
                " units, height: " + height + " units, color: " + this.color);
    }
}
