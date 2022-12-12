package core.basesyntax;

public class Figure implements AreaCalculator, DrawFigure {
    private String color;

    public Figure(String color) {
    }

    public String getColor() {
        return color;
    }

    public IsoscelesTrapezoid setColor(String color) {
        this.color = color;
        return null;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
