package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String figureProperty, String color, int side) {
        super(figureProperty, color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureProperty() + ", area: "
                + getParameters() + " sq. units, side length: " + getSide()
                + " units, color: " + getColor());
    }

    @Override
    public double getParameters() {
        return side * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
