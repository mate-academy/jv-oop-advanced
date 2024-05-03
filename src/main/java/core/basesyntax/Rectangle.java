package core.basesyntax;

public class Rectangle extends Figure {

    private int lenght;
    private int width;

    public Rectangle(String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {

    }

    @Override
    public String draw() {
        return "Rectangle{" + " color = " + getColor()
                + " length = " + lenght
                + " width = " + width
                + " area="
                + this.getArea()
                + '}';
    }

    @Override
    public double getArea() {
        return lenght * width;
    }
}
