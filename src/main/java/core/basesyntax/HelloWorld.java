package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figure = {
                new Rectangle(colorSupplier.getRandomColor(), figureSupplier.getRandom(),
                        figureSupplier.getRandom()),
                new Circle(colorSupplier.getRandomColor(), figureSupplier.getRandom()),
                new Square(colorSupplier.getRandomColor(), figureSupplier.getRandom()),
                new RightTriangle(Color.RED.toString(), 11, 6),
                new IsoscelesTrapezoid(Color.GREAN.toString(), 10, 4, 7),
                new FigureSupplier().getDefaultFigure()
        };
        for (Figure figure1 : figure) {
            figure1.draw();
        }
    }
}
