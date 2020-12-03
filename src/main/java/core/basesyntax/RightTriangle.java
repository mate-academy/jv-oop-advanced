package core.basesyntax;

public class RightTriangle extends Figure implements Drawing {
    private double side;
    private double height;

    public RightTriangle(String color,double side, double height) {
        super(color);
        this.side = side;
        this.height = height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return 1 / 2 * side * height;
    }

    @Override
    public void draw() {
        System.out.println(("Shape: Right Triangle, area: " + getArea()
                + " . units, height :" + getHeight()
                + "5 units,+ color: " + getColor()));
    }

}
