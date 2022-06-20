package core.basesyntax;

public abstract class Figures implements AreaCalculator, DrawFigure {
    private String color;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this);
    }
}
