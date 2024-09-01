package core.basesyntax;

public class Rectangle extends Figure {

    private String name = "Rectangle";
    private double firstLeg, secondLeg;
    private String color;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public Rectangle() {
    }

    @Override
    public double findArea() {
        return firstLeg * secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String printAllInformation() {
        return "Figure" + ": " + getName() + ", area: " + findArea() +
                " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg() +
                " units, color: " + getColor();
    }
}
