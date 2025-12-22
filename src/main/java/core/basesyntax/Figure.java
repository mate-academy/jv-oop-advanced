package core.basesyntax;

public abstract class Figure {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract String getTypeFigure();
    public abstract String draw();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
