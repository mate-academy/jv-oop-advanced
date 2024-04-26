package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final Colors color;
    private final double side1;
    private final double side2;
    private final double height;

    public IsoscelesTrapezoid(Colors color, double side1, double side2, double height){
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (side1 + side2) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() + " sq. units, base1: "
                + side1 + " units, base2: " + side2 + " units, height: " + height + " units, color: " + color);
    }
}
