package core.basesyntax;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, Color color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.setColor(color);
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

    @Override
    public Color getColor() {
        return super.getColor();
    }

    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure : " + getClass().getName().substring(16)
                + ", area: " + String.format("%.3f", getArea()) + " units, side a: "
                + getSideA() + " units, side b: "
                + getSideB() + " units, color: "
                + getColor().toString().toLowerCase());
    }
}
