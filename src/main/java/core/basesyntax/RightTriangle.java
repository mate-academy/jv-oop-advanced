package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    @Override
    public double countArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public void draw(Figure figure) {
        System.out.println("Figure: right triangle, " + "area: " + figure.countArea()
                + " sq.units, " + "first leg: " + firstLeg + " units,"
                + " second leg " + secondLeg + " units,"
                + " color: " + figure.getColor());
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
}
