package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String color) {
        super(color);
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setHeight(height);
    }

    @Override
    public double area() {
        double s;
        s = (((getSideA() + getSideB()) / 2) * getHeight());
        return s;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + " units, side: " + getSideA() + "," + getSideB() + " height: "
                + getHeight() + " units, color: " + getColor();
    }
}
