package core.basesyntax;

public class Figure implements ColorSupplier, FigureSupplier {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Figure() {
    }

    public Color getColor() {
        return color;
    }

    double getArea() {
        return 0.0;
    }

    void draw() {
    }
}


