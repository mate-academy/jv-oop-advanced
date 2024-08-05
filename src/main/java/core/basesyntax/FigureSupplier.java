package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public FigureMethods getRandomFigure() {
        int figureType = random.nextInt(5);
        String color = colorSupplier.getRandomColor();
        return null;
    }
    public FigureMethods getDefaultFigure() {
        return new Circle(10, Color.WHITE) ;
    }
}
