package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles-trapezoid, area: " + area() + " sq.units, sideA: " + sideA + "units, sideB:" + sideB + "units, height:" + height + " units, color: " + color.toLowerCase());
    }

    @Override
    public double area() {
        return height/2*(sideA + sideB);
    }
}
