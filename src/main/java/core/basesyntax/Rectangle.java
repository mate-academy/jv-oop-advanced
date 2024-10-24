package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatedArea() {
        return width * height;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Rectangle Width: " + width + ", Height: " + height);
    }
}
