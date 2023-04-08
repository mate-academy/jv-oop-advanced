package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = {
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                new Square(11),
                new Circle(20),
                new IsoscelesTrapezoid(11,12,13)
        };
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
