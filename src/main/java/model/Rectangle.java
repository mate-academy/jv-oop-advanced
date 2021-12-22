package model;

public class Rectangle extends Figure {
    private int side1;
    private int side2;

    public Rectangle(int side1, int side2, String color) {
        this.side1 = side1;
        this.side2 = side2;
        setColor(color);
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + this.getClass().getSimpleName() + ",area:" + getArea()
                + "sq.units,side1:" + side1 + "units,side2:" + side2 + "units,color:" + getColor());
    }
}
