package core.basesyntax;

public class Rectangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Rectangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
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

    @Override
    public double getArea() {
        double area = firstLeg * secondLeg;
        return area;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getName() + ", area: " + this.getArea()
                + " sq.units, firstLeg: " + this.getFirstLeg() + " units, secondLeg: "
                + this.secondLeg + " units. color: " + this.getColor());
    }
}
