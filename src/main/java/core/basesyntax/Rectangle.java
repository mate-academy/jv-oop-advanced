package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;
    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getSimpleName() + "\n"
                + "Color " + color + "\n"
                + "Area " + getArea() + "\n"
                + "Length " + length
                + "Width " + width);
    }
}
