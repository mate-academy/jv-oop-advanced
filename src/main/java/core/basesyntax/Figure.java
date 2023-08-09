package core.basesyntax;

public abstract class Figure implements FigureDrawer, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + getClass().getSimpleName()
                + ", area: " + getArea()
                + " sq.units, color: " + getColor().toLowerCase());
    }
}
