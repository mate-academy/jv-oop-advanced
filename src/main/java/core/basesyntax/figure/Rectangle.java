package core.basesyntax.figure;

public class Rectangle extends Figure{
    private double height;
    private double width;
    private static final String FIGURE_NAME = "rectangle";

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, double height, double width){
        this.color = color;
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        String str = "Figure: " + FIGURE_NAME + ", area: " + getArea() + " sq.units, height: " + height + ", width: " + width;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return height * width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
