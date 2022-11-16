package core.basesyntax;

public class Figure implements InfoPrinter, AreaCalculator {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
