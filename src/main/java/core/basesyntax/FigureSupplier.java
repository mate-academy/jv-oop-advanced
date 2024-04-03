package core.basesyntax;

public class FigureSupplier {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figure[] figures = new Figure[5];
        figures[0] = new Circle(colorSupplier.getRandomColor(),Math.random() * 100);
        figures[1] = new Rectangle(colorSupplier.getRandomColor(),Math.random() * 100,
                Math.random() * 100);
        figures[2] = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),Math.random() * 100,
                Math.random() * 100, Math.random() * 100);
        figures[3] = new RightTriangle(colorSupplier.getRandomColor(), Math.random() * 100,
                Math.random() * 100);
        figures[4] = new Square(colorSupplier.getRandomColor(), Math.random() * 100);
        int count = (int)(Math.random() * 4);
        return figures[count];
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10.0);
    }
}
