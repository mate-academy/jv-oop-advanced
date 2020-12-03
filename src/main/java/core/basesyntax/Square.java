package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side1) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println(("Shape: Square, area: " + getArea()
                + " . units, height :" + getDiagonale()
                + "5 units,+ color: " + getColor()));
    }

    @Override
    public double getArea() {
        return side * side;
    }

    private double getDiagonale() {
        return Math.sqrt((2) * side);
    }

}
