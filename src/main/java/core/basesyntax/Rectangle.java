package core.basesyntax;

public class Rectangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

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
    public String toString() {
        System.out.println("Rectangle{" + "firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
        return "";
    }
}
