package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double v) {
        super(color.toString());
        this.side = v;
    }

    @Override
    public void draw() {
        System.out.print("Figure:" + "square," + "area:" + getArea() + "s q. units ");
        System.out.println("side:" + this.side + " units," + "Color:" + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
