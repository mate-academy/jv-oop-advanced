package core.basesyntax;

public abstract class Figure implements DrawFigure, AreaCalculator {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea()
                + " sq. units, color: " + color);
    }
}
