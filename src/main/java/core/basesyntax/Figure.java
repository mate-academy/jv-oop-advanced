package core.basesyntax;

public class Figure implements AreaCalculator, FigureDrawing {
    private String color;

    public Figure() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
    }

    @Override
    public double getArea() {
        return 0;
    }
}
