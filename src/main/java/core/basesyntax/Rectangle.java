package core.basesyntax;

public class Rectangle extends Figure {
    double side1;
    double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("This is Rectangle. First side = " + side1 + "second side = " + side2
                + "; area = " + this.getArea());
    }
}
