package core.basesyntax;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String figure, String color, double length, double width) {
        super(figure, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void getInformation() {
        System.out.println("Figure : " + getFigure() + ", color : "
                + getColor() + ", length : " + length
                + " units, width : " + width + " units, area : " + getArea() + " sq.units");
    }
}
