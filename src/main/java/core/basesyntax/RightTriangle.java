package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    //counting area of right triangle
    @Override
    public double countArea(Figure figure) {
        return area = 0.5 * firstLeg * secondLeg;
    }

    public void printInfo(Figure figure) {
        System.out.println("Figure: right triangle, " + "area: " + figure.countArea(figure)
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
