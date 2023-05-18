package core.basesyntax;


public class Main {

    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[SIZE_OF_ARRAY];

        for(int i = 0; i < SIZE_OF_ARRAY / 2; i++){
            figures[i] = figureSupplier.getRandomFigure();
            System.out.println(figures[i]);
        }

        for(int i = SIZE_OF_ARRAY / 2 ;i < SIZE_OF_ARRAY;i++){
            figures[i] = figureSupplier.getDefaultFigure();
            System.out.println(figures[i]);
        }

    }

}
