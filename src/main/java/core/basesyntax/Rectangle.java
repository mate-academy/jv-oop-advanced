package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public Rectangle(double firstLeg, double secondLeg, String color) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getArea() {
        return getSecondLeg() * getFirstLeg();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure " + "rectangle "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + getFirstLeg() + ",secondLeg: "
                + getSecondLeg() + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
