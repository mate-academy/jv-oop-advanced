package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = {supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getRandomFigure(),
                supplier.getDefaultFigure(),
                supplier.getDefaultFigure(),
                supplier.getDefaultFigure()
        };

        for (Figure figure : figures) {
            System.out.println(figure);
        }

    }

}
