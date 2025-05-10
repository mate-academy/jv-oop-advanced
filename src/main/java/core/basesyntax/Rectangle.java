package core.basesyntax;

public class Rectangle extends Figure implements GetFigureArea {
    private double side1;
    private double side2;

    public void draw() {
        System.out.println("Figure - Rectangle: side1 " + this.side1
                + " ,side2 " + this.side2
                + " ,area " + this.getArea() + " color "
                + this.getColor());
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
}
