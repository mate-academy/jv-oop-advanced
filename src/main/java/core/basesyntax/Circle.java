package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    public Circle(String color, double parameter) {
        super(color, parameter);
    }

    @Override
    public double getArea() {
        return Math.PI * getParameter() * getParameter();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle " + getArea()
                + " sq.units, radius: " + getParameter()
                + " units, color: " + getColor());
    }
}
