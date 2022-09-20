package core.basesyntax;

public class Square extends Figure implements Behaviour {
    private final double  side = Math.random() * (10.00);
    
    @Override
    public double getArea() {
        return side * side;
    }
    
    @Override
    public String draw() {
        return " Figure: Square,  area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + color();
    }
}
