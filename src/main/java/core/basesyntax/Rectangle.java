package core.basesyntax;

public class Rectangle extends Figure {
    double side1;
    double side2;
    double side3;

    public Rectangle(double side1, double side2, double side3) {
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    @Override
    public void calculateArea() {
        this.area = (side1 + side2 + side3) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Square, my area: " + area
                + " my side: " + side + " my color: " + getColor());
    }
}
