package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private int width;
    private int height;
    private String color;

    public Rectangle(Figure.FigureSupplier figureSupplier, ColorSupplier colorSupplier) {
        this.width = figureSupplier.getRandomFigure();
        this.height = figureSupplier.getRandomFigure();
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: rectangle, width: " + width
                + ", height: " + height + ", area: " + df.format(getArea())
                + ", color: " + color);
    }
}
