package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSquare(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public void calculateArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        System.out.println("Hello, my name is Square, my area: " + getArea()
                + " my side: " + side + " my color: " + getColor());
    }
}
