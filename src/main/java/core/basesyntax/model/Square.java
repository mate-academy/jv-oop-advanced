package core.basesyntax.model;

public class Square extends Figure {

    private int length;

    public Square(String color, double length) {
        super(color);
        this.length = (int) length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure Square"
                + "\nmeasure: " + getArea()
                + "\nColor: " + getColor());
    }
}
