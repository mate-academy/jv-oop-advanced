package core.basesyntax;

public abstract class Figure implements AreaCalculation {
    public static final double COEFFICIENT = 0.5;
    private String color;
    private String name;

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

}
