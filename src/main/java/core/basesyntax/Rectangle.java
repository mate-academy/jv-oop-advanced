package core.basesyntax;

import java.util.Locale;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: rectangle, area: "
                + getArea() + " sq.units, first leg: "
                + getFirstLeg() + ", second leg "
                + getSecondLeg() + ", color: "
                + getColor().toLowerCase(Locale.ROOT);
    }
}
