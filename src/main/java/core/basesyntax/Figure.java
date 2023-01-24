package core.basesyntax;

public abstract class Figure implements AreaCalculation, Draw {
    private String color;
    private float area;

    public Figure() {}

    public Figure(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

}
