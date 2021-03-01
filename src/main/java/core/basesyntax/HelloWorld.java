package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        ColorSupplier colorSupplier = new ColorSupplier();
        String randomColor = colorSupplier.getRandomColor();

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure randomFigure = figureSupplier.getFigureProperty();
        randomFigure.setColor(randomColor);
        randomFigure.draw();
    }
}
