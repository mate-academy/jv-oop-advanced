package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private double downLength;
    private double height;
    private double topLength;

    public IsoscelesTrapezoid(String color, double downLength, double height, double topLength) {
        super(color);
        this.downLength = downLength;
        this.height = height;
        this.topLength = topLength;
    }

    public double getDownLength() {
        return downLength;
    }

    public void setDownLength(int downLength) {
        this.downLength = downLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getTopLength() {
        return topLength;
    }

    public void setTopLength(int topLength) {
        this.topLength = topLength;
    }

    @Override
    public double getArea() {
        return height * ((downLength + topLength) * 0.5);
    }

    @Override
    public void draw() {
        System.out.println("Figure is: " + getClass().getSimpleName() + "; "
                + "area is :" + getArea() + "; "
                + "top side is :" + getTopLength() + "; "
                + "down side is :" + getDownLength() + "; "
                + "height is :" + getHeight() + "; "
                + "color is: " + getColor());
    }
}
