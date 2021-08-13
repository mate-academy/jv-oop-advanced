package core.figureClasses;

import core.interfaces.AreaCalculator;
import core.interfaces.Draw;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, String color, int firstSide, int secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void drawing() {
        System.out.println("Figure: " + this.name + ", area: " + area() + " sq.units, first side: " + firstSide +
                " units, second side: " + secondSide + " units, color: " + this.color);
    }
}
