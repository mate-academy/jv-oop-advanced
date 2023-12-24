package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String name, String color) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "side: " + getSide()
                + ", " + "color: " + getColor());
    }

    public double getSide() {
        return side;
    }

}
