package core.basesyntax;

public abstract class AbstrFigure implements Figure {
    private String color;
    private double area;

    double getArea() {
        return area;
    };

    public AbstrFigure(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure");
    }
}
