package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int heigth;

    public Rectangle(String color, int width, int heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }

    @Override
    public void draw() {
        System.out.println("The " + getColor() + " rectangle has a width of " + width
                + ", a height of " + heigth + " and an area of " + getArea());
    }
}
