package core.basesyntax;

public class Square extends Figure {
    public Square(String color, double parameter) {
        super(color, parameter);
    }

    @Override
    public double getArea() {
        return getParameter() * getParameter();
    }

    @Override
    public void draw() {
        System.out.println("Figure: square " + getArea()
                + " sq.units, side: " + getParameter()
                + " units, color: " + getColor());
    }
}
