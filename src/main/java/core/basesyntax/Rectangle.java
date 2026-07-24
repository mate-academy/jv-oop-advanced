package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.width = firstLeg;
        this.height = secondLeg;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, firstLeg: " + width
                + " units, secondLeg: " + height
                + " units, color: " + getColor());
    }
}
