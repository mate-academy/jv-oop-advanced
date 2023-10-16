package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(Color color, double firstLeg, double secondLeg) {
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
        System.out.println("Rectangle{" + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
    }
}
