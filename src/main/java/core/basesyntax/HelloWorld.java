package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static final int COUNT_FIGURES = 6;

    public static void main(String[] args){
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[COUNT_FIGURES];
        int i = 0;
        for (; i < COUNT_FIGURES/2; i++){
            figures[i] = supplier.getRandomFigure();
        }
        for (; i < COUNT_FIGURES; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (int num = 0; num < COUNT_FIGURES; num++) {
            System.out.println(figures[num].showInformation());
        }
    }
}
