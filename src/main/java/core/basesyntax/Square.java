package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Figure : square" + " Area : " + getArea() + " Side : " + getSide()
                + " Color : " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure : square" + " Area : " + getArea() + " Side : " + getSide()
                + " Color : " + getColor();
    }
}
