package core.basesyntax;

public class RightTriangle extends Figure implements Drawable {

    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public double getAreaFigures() {
        return getArea((firstLeg * secondLeg) / 2);
    }

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getAreaFigures() + " sq.units, "
                + "firstLeg: " + getFirstLeg() + " units, "
                + "secondLeg: " + getSecondLeg() + " units "
                + "color: " + getColor());
    }
}
