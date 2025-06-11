package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
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
        System.out.println("Figure: Rectangle, color: " + getColor() + ", first leg: "
                + firstLeg + "second led: " + secondLeg
                + ", area: " + getArea());
    }

}
