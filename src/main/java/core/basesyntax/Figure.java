package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String color;
    public Figure(String color) {
        this.color = color;
    }

    @Override
    public abstract double getArea();

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + figureType() + ", area: " + getArea() + " sq.units, color: " + color);
    }
    public abstract String getAdditionalInfo();
    public abstract String figureType();
}
