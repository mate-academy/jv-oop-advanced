package core.basesyntax;

public class Square extends Figure {

    private double side;
    private String color;

    public Square(double size, String color) {
        this.side = size;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    public double uniqueMethod() {
        return side;
    }

    public void draw() {
        System.out.println(getClass().getSimpleName() + ", area : " + getArea()
                + " sq. units, " + "Its' side length is " + uniqueMethod()
                + " units , color: " + this.color.toLowerCase());
    }
}
