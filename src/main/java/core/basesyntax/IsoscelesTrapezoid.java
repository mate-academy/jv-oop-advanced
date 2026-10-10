package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double lengthBaseB;
    private double height;
    private double lengthBaseA;

    public IsoscelesTrapezoid(String color, double lengthBaseB, double height, double lengthBaseA) {
        super(color);
        this.lengthBaseB = lengthBaseB;
        this.height = height;
        this.lengthBaseA = lengthBaseA;
    }

    @Override
    public double getArea() {
        return (lengthBaseB + lengthBaseA) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, lengthBaseB: " + lengthBaseB
                + " units, lengthBaseA: " + lengthBaseA
                + " units, height: " + height
                + " units, color: " + getColor()
        );
    }
}
