package core.basesyntax;

public class Square extends Figure {

    private String name = "Square";
    private double firstLeg, secondLeg;
    private String color;

    public Square(double firstLeg, String color) {
        this.firstLeg = firstLeg;
        secondLeg = firstLeg;
        this.color = color;
    }

    public Square() {
    }

    @Override
    public double findArea() {
        return firstLeg * secondLeg;
    }

    public String getName() {
        return name;
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

    @Override
    public String printAllInformation() {
        return "Figure" + ": " + getName() + ", area: " + findArea() +
                " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: " + getSecondLeg() +
                " units, color: " + getColor();
    }
}
