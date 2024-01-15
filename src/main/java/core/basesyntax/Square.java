package core.basesyntax;

public class Square extends Figure {
    private double valueSide;

    public Square(String color, double valueSide) {
        super(color);
        this.valueSide = valueSide;
    }

    public double getValueSide() {
        return valueSide;
    }

    public void setValueSide(double valueSide) {
        this.valueSide = valueSide;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: square, area: "
                + calculateArea() + " sq.units, side: "
                + getValueSide() + " units, color: "
                + getColor());
    }

    @Override
    public double calculateArea() {
        return valueSide * valueSide;
    }
}
