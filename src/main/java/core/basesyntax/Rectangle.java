package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double height;

    public Rectangle(String color, double firstLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstLeg * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, side: " + firstLeg
                + " height " + height
                + " units, color: " + getColor());
    }
}
