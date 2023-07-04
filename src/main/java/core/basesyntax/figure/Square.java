package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Square extends Figure {

    private int side = 0;
    private double area = 0;

    public Square(String name, Color color) {
        setName(name);
        setColor(color);
        randomFigure();
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

    @Override
    public void randomFigure() {
        setSide(randomSideFigure());
    }
}
