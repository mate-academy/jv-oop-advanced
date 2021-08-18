package core.basesyntax;

public class FigureSupplier {

    public Figure getRandomFigure() {
        String figureColor = new ColorSupplie().getRandomColor();
        int size = (int) (Math.random() * 100);
        switch ((int) (Math.random() * 5)) {
            case 0:
                return new Circle(figureColor, size);
            case 1:
                return new IsoscelesTrapezoid(figureColor, size, size, size);
            case 2:
                return new Rectangle(figureColor, size, size);
            case 3:
                return new RightTriangle(figureColor, size, size);
            default:
                return new Square(figureColor, size);
        }
    }
}
