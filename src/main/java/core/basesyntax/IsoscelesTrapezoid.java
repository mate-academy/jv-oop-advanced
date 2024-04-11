package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{

    private String color;
    private double base1;
    private double base2;
    private double heigthTrapezoid;

    public IsoscelesTrapezoid (String color, double base1, double base2, double heigthTrapezoid){
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.heigthTrapezoid = heigthTrapezoid;
    }
    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0.5 * (base1 + base2) * heigthTrapezoid;
    }

    @Override
    public void draw() {
System.out.println("Figure: isosceles trapezoid, area: " + getArea()
        + " sq. units, base1: " + base1 + " units, base2: " + base2 + " units, height: "
        + heigthTrapezoid + " units, color: " + color);
    }
}
