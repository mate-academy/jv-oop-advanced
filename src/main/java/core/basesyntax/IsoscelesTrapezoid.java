package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double side1 = Math.random() * (10.00);
    private final double side2 = Math.random() * (10.00);
    private final double height = Math.random() * (10.00);
    
    @Override
    public double getArea() {
        return ((side1 + side2) / 2 * height);
    }
    
    @Override
    public String draw() {
        return " Figure: isosceles trapezoid,  area: " + getArea() + " sq.units, side: "
                + side1 + " " + side2 + " units, color: " + color();
    }
}
