package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        FigureSupplier figuresupplier = new FigureSupplier();
        Figure[] figures = new Figure[]
                {figuresupplier.getRandomFigure(),figuresupplier.getRandomFigure(),
                figuresupplier.getRandomFigure(), figuresupplier.getDefaultFigure(),
                figuresupplier.getDefaultFigure(),figuresupplier.getDefaultFigure()};

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
