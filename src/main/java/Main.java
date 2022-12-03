import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[] {
                supplier.rectangle(),
                supplier.trapezoid(),
                supplier.square(),
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getDefaultFigure()
        };
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
