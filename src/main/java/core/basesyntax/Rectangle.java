package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, Color color) {
        super(color);
        this.setFirstLeg();
        this.setSecondLeg();
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg() {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg() {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg();
    }

    @Override
    public String toDraw() {
        return " Figure: RightTriangle, area: " + getArea()
                + " sq.units, firstLeg: " + getFirstLeg()
                + " units, secondLeg: " + getSecondLeg()
                + " units, color: " + getColor();
    }
}
