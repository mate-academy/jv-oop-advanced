package core.basesyntax;

public class IsoscelesTrapezoid implements Behavior{
    private double sideA;
    private double sideB;
    private double height;
    private String color;
    private static final int DIVISOR = 2;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    public double getArea() {
        return ((sideA + sideB) / DIVISOR) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, sideA: " + sideA + " units, sideB: " + sideB + " units, vysota: " + height + " units, color: " + color);
    }
}
