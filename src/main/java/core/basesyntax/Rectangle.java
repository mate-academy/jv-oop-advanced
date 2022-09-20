package core.basesyntax;

public class Rectangle extends Figure implements Behaviour {
    private final double side1 = Math.random() * (10.00);
    private final double side2 = Math.random() * (10.00);
    
    @Override
    public double getArea() {
        return side1 * side2;
    }
    
    @Override
    public String draw() {
        return " Figure: Rectangle,  area: " + getArea() + " sq.units, side: "
                + side1 + " " + side2 + " units, color: " + color();
    }
}
