package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends FigureSupplier implements Drawable {
    private int widht;
    private int height;
    private String color;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Rectangle() {
        this.widht = getRandomFigure();
        this.height = getRandomFigure();
        this.color = colorSupplier.getRandomColor();
    }

    @Override
    public double getArea() {
        return widht * height;
    }

    @Override
    public void draw() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: rectangle, widht: " + widht
                + ", height: " + height + ", area: " + df.format(getArea())
                + ", color: " + color.toLowerCase());
    }
}
