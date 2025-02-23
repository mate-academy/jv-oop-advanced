package core.basesyntax;

public class Square extends Figure {

    private double side;

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName() + ", area: " + area() + "sq. units, "
                           + "side: " + side + " units, color: " + super.getColor());
    }
}
