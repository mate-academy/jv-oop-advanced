package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends FigureSupplier {
    private int widht;
    private int height;
    private ColorSupplier colorSupplier;

    public Rectangle() {
        this.widht = getRandomFigure();
        this.height = getRandomFigure();
        this.colorSupplier = new ColorSupplier();
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
                + ", color: " + ColorSupplier.getRandomColor());

    }
}
