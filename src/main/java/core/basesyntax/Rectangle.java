package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, int firstSide, int secondSide, String color) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setName("Rectangle");
    }

    @Override
    public int area() {
        return firstSide * secondSide;
    }

    @Override
    public String giveAllTheInformation() {
        return "Figure: " + getName() + "area: " + area() + "sq.units, " + "firstSide: "
                + firstSide + " units" + " secondSide: " + secondSide + " units"
                + " units" + " color: " + getColor();
    }
}
