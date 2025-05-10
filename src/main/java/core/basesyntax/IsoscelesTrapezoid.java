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

    private String color() {
        return getColor();
    }

    @Override
    public double area() {
        return ((sideA + sideB) / 2) * height;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + area()
                + " units, side: " + sideA + "," + sideB + " height: "
                + height + " units, color: " + color());
    }
}
