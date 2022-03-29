package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = {figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                new Square(10, "blue"),
                new Circle(10, "red"),
                new Rectangle(10, 2,"green"),
                new RightTriangle(10, 2,"brown"),
                new IsoscelesTrapezoid(10, 2, 5,"brown"),
                figureSupplier.getDefaultFigure()};
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
