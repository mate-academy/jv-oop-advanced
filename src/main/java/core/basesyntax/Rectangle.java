package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(String color, double hight, double width) {
        super(color);
        this.height = hight;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    public void drawFigure() {
        System.out.println("Figure: Rectangle" + ", area: " + getArea() + " sq.units, "
                + "hight: " + height + ", widht: " + width + ", color: " + color);
    }

}
