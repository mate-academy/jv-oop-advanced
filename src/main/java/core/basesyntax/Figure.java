package core.basesyntax;

public class Figure implements FigureSupplier, Printable {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public Figure() {

    }

    public double getArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Figure getRandomFigure() {
        return null;
    }

    @Override
    public void print() {

    }
}
