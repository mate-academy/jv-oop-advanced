package core.basesyntax;

public class Rectangle extends Figure {
    private int lengthRectangle;
    private int widthRectangle;

    public Rectangle(int lengthRectangle, int widthRectangle, String color) {
        this.lengthRectangle = lengthRectangle;
        this.widthRectangle = widthRectangle;
        setColor(color);
    }

    @Override
    public void area() {
        double areaRectangle = lengthRectangle * widthRectangle;
        System.out.println("The area of the rectangle is " + areaRectangle +
                " and colo " + getColor());
    }
}
