package core.basesyntax.model;

public class Square extends Figure {
    private int sideLength;

    public Square(String color, int sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure is: " + getClass().getSimpleName() + "; "
                + "area is :" + getArea() + "; "
                + "side is :" + getSideLength()
                + "color is: " + getColor());
    }
}
