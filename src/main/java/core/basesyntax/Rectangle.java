package core.basesyntax;

public class Rectangle extends Figure {
    private int heighth;
    private int width;

    public Rectangle(String color, int heighth, int width) {
        super(color);
        this.heighth = heighth;
        this.width = width;
    }

    @Override
    public double getArea() {
        return heighth * width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, "
                + "Area: " + getArea()
                + " heigth: " + this.heighth + " width: "
                + this.width + " color: " + super.color);
    }
}
