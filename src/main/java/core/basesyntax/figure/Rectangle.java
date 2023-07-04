package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Rectangle extends Figure {

    private int lengthRectangle = 0;
    private int widthRectangle = 0;
    private double area = 0;

    public Rectangle(String name, Color color) {
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

    public int getLengthRectangle() {
        return lengthRectangle;
    }

    public void setLengthRectangle(int lengthRectangle) {
        this.lengthRectangle = lengthRectangle;
    }

    public int getWidthRectangle() {
        return widthRectangle;
    }

    public void setWidthRectangle(int widthRectangle) {
        this.widthRectangle = widthRectangle;
    }

    public void resultArea() {
        setArea(getLengthRectangle() * getWidthRectangle());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", length: " + getLengthRectangle() + " units, "
                + "width: " + getWidthRectangle() + " units, "
                + "color: " + getColor().name());
    }

    @Override
    public void randomFigure() {
        setLengthRectangle(randomSideFigure());
        setWidthRectangle(randomSideFigure());
        resultArea();
    }
}
