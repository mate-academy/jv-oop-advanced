package core.basesyntax;

public class Square extends Figure{
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("This is Square. Side = " + side + "; area = " + this.getArea()
                + "; color is " + getColor());
    }
}
