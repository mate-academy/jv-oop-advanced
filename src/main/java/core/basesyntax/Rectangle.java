package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculaton, PrintInfo {
    private final double firstLeg;
    private final double secondLeg;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String getInformation() {
        return "Figure" + " " + "Rectangle" + " " + "FirstLeg" + " " + firstLeg + " " + "SecondLeg"
                + " " + secondLeg + " " + "Area" + " " + getArea() + " " + "Color" + " " + color;
    }
}
