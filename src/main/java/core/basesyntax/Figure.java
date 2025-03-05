package core.basesyntax;

public class Figure implements Draw, AreaCalculator {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculate() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
