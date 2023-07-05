package core.basesyntax.figure;

import core.basesyntax.behaviour.FigureAreaCalculator;
import core.basesyntax.tools.Color;

public class Square extends Figure implements FigureAreaCalculator {
    private int side;
    private double area;

    public Square(String name, Color color, int side) {
        super(name, color);
        this.side = side;
        resultArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
        resultArea();
    }

    @Override
    public void resultArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", side: " + getSide() + " units, "
                + "color: " + getColor().name());
    }
}
