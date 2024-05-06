package core.basesyntax;

public class Rectangle extends Figure {
    private int lenght;
    private int width;

    public Rectangle(String color, int lenght, int width) {
        super(color);
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle{" + " color = " + getColor()
                + " length = " + lenght
                + " width = " + width
                + " area="
                + this.getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return lenght * width;
    }
}
