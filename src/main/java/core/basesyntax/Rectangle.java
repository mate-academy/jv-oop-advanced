package core.basesyntax;

public class Rectangle extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.setName("Rectangle");
    }

    @Override
    double area() {
        return sideB * sideA;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + getName() + ", area: " + String.format("%.2f",this.area()) + " sq.units, side A: "
                + String.format("%.2f", sideA) + " units, side B: " + String.format("%.2f", sideB) + " units, color: " + getColor());
    }
}
