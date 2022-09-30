package core.basesyntax;

public class Figure implements AreaCalculator, Drawing {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public String draw() {
        return "";
    }
}
