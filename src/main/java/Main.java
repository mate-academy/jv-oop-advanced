import core.basesyntax.Figure;
import core.basesyntax.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            supplier.getRandomFigure();
        }
        Figure defaultFigure = supplier.getDefaultFigure();
    }
}
