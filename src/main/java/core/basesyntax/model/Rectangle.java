package core.basesyntax.model;

public class Rectangle extends Figure {
    private int lengthRectangle;
    private int widthRectangle;

    public Rectangle(int lengthRectangle, int widthRectangle) {
        this.lengthRectangle = lengthRectangle;
        this.widthRectangle = widthRectangle;
    }

    @Override
    public double areaCalculation() {
        return lengthRectangle * widthRectangle;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle, area: " + areaCalculation()
                + " sq.units, length: " + lengthRectangle + " units, width: "
                + widthRectangle + " units, color: " + getColor());
    }
}
