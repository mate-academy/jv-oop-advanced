package core.basesyntax;

public class RightTriangle extends Figure {
    private int firsLeg;
    private int secondLeg;

    public RightTriangle(String name, String color) {
        super(name, color);
        this.firsLeg = (int)(Math.random() * 100);
        this.secondLeg = (int)(Math.random() * 100);
    }

    @Override
    public double getArea() {
        return firsLeg * secondLeg / 2.0;
    }

    @Override
    public String drow() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq.units, "
                    + "firstLeg: " + firsLeg + " units, " + "secondLeg: "
                    + secondLeg + " units, " + "color: " + getColor();
    }
}
