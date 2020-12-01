package core.basesyntax;

public class Triangle extends Shape {
    private double side;

    public Triangle() {
        super();
        this.side = Math.random() * (11 - 1) + 1;
    }

    @Override
    public double getArea() {
        return (getHeight() * side) / 2;
    }

    @Override
    public double getPerimeter() {
        return side * 3;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: triangle, perimeter: " + getPerimeter() +
                ", area: " + getArea() +
                " sq. units, side: " + getSide() +
                " units, height: " + getHeight() +
                " units, color: " + getColor() + ".");
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return Math.sqrt(Math.pow(side, 2) - Math.pow(side/2, 2));
    }
}
