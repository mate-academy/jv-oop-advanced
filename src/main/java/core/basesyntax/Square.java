package core.basesyntax;

public class Square extends ColorFigure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:  "
                + getArea() + " sq. units, " + "side: "
                + getSide() + " units, color: " + getColor());
    }

    public double getArea() {
        return side * side;
    }
}

