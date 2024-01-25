package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double bottomLength;
    private double topLength;
    private double height;

    public IsoscelesTrapezoid(String color, double bottomLength, double topLength, double height) {
        super(color);
        this.bottomLength = bottomLength;
        this.topLength = topLength;
        this.height = height;
    }

    public double getBottomLength() {
        return bottomLength;
    }

    public void setBottomLength(double bottomLength) {
        this.bottomLength = bottomLength;
    }

    public double getTopLength() {
        return topLength;
    }

    public void setTopLength(double topLength) {
        this.topLength = topLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles trapezoid with top length of " + topLength
                + ", bottom length of " + bottomLength + " and " + getColor() + " color");
    }

    @Override
    public double getArea() {
        return (topLength + bottomLength) * height / 2;
    }
}
