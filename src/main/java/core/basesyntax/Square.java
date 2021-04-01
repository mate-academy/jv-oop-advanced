package core.basesyntax;

public class Square extends Figure {
    double side;


    public Square(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public void calculateArea() {
        this.area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Square, my area: " + area
                + " my side: " + side + " my color: " + getColor());
    }
}
