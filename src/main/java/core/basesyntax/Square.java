package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color, String typeOfFigure) {
        super(color, typeOfFigure);
        this.side = side;
    }

    public double getSide() {
        return this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeOfFigure()
                + ", area: " + getArea() + " sq. units, side length: "
                + getSide() + " units, color: " + getColor());
    }
}
