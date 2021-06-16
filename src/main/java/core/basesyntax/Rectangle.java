package core.basesyntax;

public class Rectangle extends Figure {
    private int length;
    private int wigth;

    public Rectangle(String color, int length, int wigth) {
        super(color);
        this.length = length;
        this.wigth = wigth;
    }

    @Override
    public double getArea() {
        return length * wigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + ", length: " + length
                + ", wigth: " + wigth
                + ", color: " + getColor());
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWigth() {
        return wigth;
    }

    public void setWigth(int wigth) {
        this.wigth = wigth;
    }
}
