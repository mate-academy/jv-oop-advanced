package core.basesyntax.model;

public class RightTriangle extends Figure {
    private int length;
    private int height;

    public RightTriangle(String color, int length, int height) {
        super(color);
        this.height = height;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) length * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure is: " + getClass().getSimpleName() + "; "
                + "area is :" + getArea() + "; "
                + "length is :" + getLength() + "; "
                + "height is : " + getHeight() + "; "
                + "color is: " + getColor());
    }
}
