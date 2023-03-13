package core.basesyntax;

public class Rectangle extends Figures {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area()
                + " sq.units, first leg: "
                + firstLeg + " units, second leg: "
                + secondLeg + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return firstLeg * secondLeg;
    }
}
