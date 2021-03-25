package core.basesyntax;

public class FigureSupplier {
    private static final Figure[] FIGURES = new Figure[] {new Circle(), new Triangle(),
            new Square(), new Rectangle(), new IsoscelesTrapezoid()};

    public static Figure randomFigure() {
        return FIGURES[(int)(Math.random() * FIGURES.length)].getRandomFigure();
    }
}
