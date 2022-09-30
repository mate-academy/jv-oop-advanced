package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figures = new Figure[] {
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getRandomFigure(),
                figureSupplier.getDefaultFigure(),
                new Rectangle(Colors.RED.name(), 4,6),
                new IsoscelesTrapezoid(Colors.PURPLE.name(), 5,3,5)
        };

        for (Figure f : figures) {
            System.out.println(f);
        }
    }
}
