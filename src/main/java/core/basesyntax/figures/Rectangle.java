package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width;
    private double heigth;

    public Rectangle(String color, int width, int heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }

    @Override
    public void draw() {
        System.out.println("figure is: Rectangle, " + "area is: " + getArea() + " sq.units, "
                + "width is: " + width + "units, " + "heigth is: " + heigth + "units, "
                + "color is: " + getColor());
    }
}
