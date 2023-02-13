package core.basesyntax;

public class Square extends Figure {
    private  double side;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + Double.toString(getArea())
                + ", perimeter: " + Double.toString(getPerimeter())
                + ", side: " + Double.toString(side)
                + ", color: " + color
        );
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            throw new RuntimeException("Side may be more than 0!");
        }
    }
}
