package core.basesyntax;

public class FigureSupplier {
    private static final Figure[] FIGURES_GENERATORS = {
            new IsoscelesTrapezoid(), new RightTriangle(),
            new Rectangle(), new Circle(), new Square()
    };

    protected static Figure generateFigure() {
        return FIGURES_GENERATORS[(int) (Math.random()
                * FIGURES_GENERATORS.length)].getRandomFigure();
    }
}
