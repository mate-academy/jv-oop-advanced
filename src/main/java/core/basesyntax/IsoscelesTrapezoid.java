package core.basesyntax;

public class IsoscelesTrapezoid implements Behavior{
    private double sideA;
    private double sideB;
    private double vysota;
    private String color;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double vysota){
        this.sideA = sideA;
        this.sideB = sideB;
        this.vysota = vysota;
        this.color = color;
    }

    public double getArea() {
        return ((sideA + sideB) / 2) * vysota;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, sideA: " + sideA + " units, sideB: " + sideB + " units, vysota: " + vysota + " units, color: " + color);
    }
}
