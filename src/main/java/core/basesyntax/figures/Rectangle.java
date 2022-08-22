package core.basesyntax.figures;

public class Rectangle extends Figure {
    private double width; // ширина
    private double heigth; // высота

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
    public double getFigureArea() {
        return width * heigth;
    }

    @Override
    public void figureDraw() {
        System.out.println("figure is: Rectangle, " + "area is: " + getFigureArea() + " sq.units, "
                + "width is: " + width + "units, " + "heigth is: " + heigth + "units, "
                + "color is: " + getColor());
    }
}
