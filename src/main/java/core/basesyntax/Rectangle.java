package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        name = "rectangle";
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %f sq.units, firstLeg: %f units, secondLeg: %f units, color: %s \n",
                name, getArea(), firstLeg, secondLeg, color);
    }
}
