package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        double area = getArea();
        String color = getColor();

        System.out.println("Figure: rectangle, area: " + area + " sq.units, color: " + color);
    }
}
