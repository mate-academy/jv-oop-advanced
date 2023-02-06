package core.basesyntax;

public class Figure implements AreaCalculator, Paint{

    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public void draw() {

    }
}
