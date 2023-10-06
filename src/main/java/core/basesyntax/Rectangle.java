package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
        getArea();
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
