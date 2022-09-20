package core.basesyntax;

public class RightTriangle extends Figure {
    private final double side1 = Math.random() * (10.00);
    private final double hight = Math.random() * (10.00);
    
    @Override
    public double getArea() {
        return 0.5 * side1 * hight;
    }
    
    @Override
    public String draw() {
        return " Figure: right triangle,  area: " + getArea() + " sq.units, side: "
                + side1 + " " + hight + " units, color: " + color();
    }
}
