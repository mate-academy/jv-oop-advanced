package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(Color color, double v) {
        super(color.toString());
        this.side = v;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + "Square," + "Area:" + getArea() + ",Color:" + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
