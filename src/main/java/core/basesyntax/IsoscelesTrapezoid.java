package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, String color, double height) {
        this.color = color;
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
        this.height = height;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return ((getFirstLeg() * getSecondLeg()) / 2) * getHeight();
    }

    @Override
    public void getDraw() {
        System.out.println("Figure "
                + "isosceles trapezoid "
                + "area: " + getArea()
                + " sq.units,  firstLeg: "
                + getFirstLeg() + ",secondLeg: "
                + getSecondLeg() + " height: "
                + getHeight() + " units,"
                + " color: " + getColor().toLowerCase());
    }
}
