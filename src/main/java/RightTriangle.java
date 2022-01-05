public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, String figureType, int firstLeg, int secondLeg) {
        super(color,figureType);
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

        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getFigureType() + "," + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " firstLeg: " + firstLeg + " units, "
                + " secondLeg: " + secondLeg + " units, "
                + " color: " + getColor());
    }
}
