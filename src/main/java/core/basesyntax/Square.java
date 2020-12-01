package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square() {
        super();
        this.side = Math.random() * (11 - 1) + 1;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, perimeter: " + getPerimeter() +
                           ", area: " + getArea() +
                           " sq. units, side: " + getSide() +
                           " units, diagonal: " + getDiagonal() +
                           " units, color: " + getColor() + ".");
    }

    public double getSide() {
        return side;
    }

    public double getDiagonal() {
        return side;
    }
}
