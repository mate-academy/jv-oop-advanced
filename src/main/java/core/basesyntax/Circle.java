package core.basesyntax;

public class Circle extends Figure implements Behaviour {
    private final double side = Math.random() * (10.00);
    
    @Override
    public String draw() {
        return " Figure: circe,  area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + color();
    }
    
    @Override
    public double getArea() {
        double pi = 3.14;
        return pi * side * side;
    }
    
}
