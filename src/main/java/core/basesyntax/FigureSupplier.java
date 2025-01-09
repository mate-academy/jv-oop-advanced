package core.basesyntax;

public class FigureSupplier {

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int index) {
        switch (index) {
            case 0: return new Square(colorSupplier.getRandomColor());
            case 1: return new Rectangle(colorSupplier.getRandomColor());
            default: return new RightTriangle(colorSupplier.getRandomColor());
        }
    }

    public Figure getDefaultFigure(int index) {
        switch (index) {
            case 4 : return new Circle("WHITE", 10);
            default : return new IsoscelesTrapezoid("BLUE",10,10,10);

        }
    }
}

