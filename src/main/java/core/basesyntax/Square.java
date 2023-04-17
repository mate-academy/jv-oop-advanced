package core.basesyntax;

public class Square extends Figure {
    private double firstLeg;

    public Square(String color, double firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    @Override
    public String toString() {
        if (getArea() == 0) {
           return  ("Square`s area is 0");
        }
        return "Figure: " + "square, "
                + "area: " + getArea()
                + " sq.units, "
                + " side: " + firstLeg
                + " units, " + " color: " + getColor();
    }

    @Override
    public double getArea() {
        double area = firstLeg * firstLeg;
        return Math.round(area * 100) / 100;
    }
}
