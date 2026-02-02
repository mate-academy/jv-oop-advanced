package core.basesyntax;

public class HelloWorld {
    public static final int SIZE_OF_ARRAY = 6;
    private static FigureSupplier sup = new FigureSupplier();

    public static void main(String[] args) {
        Figure [] arr = new Figure[SIZE_OF_ARRAY];
        for (int i = 0;i < SIZE_OF_ARRAY / 2;i++) {
            arr[i] = sup.getRandomFigure();
        }

        arr[3] = sup.getDefaultFigure();
        arr[4] = sup.getDefaultFigure();
        arr[5] = sup.getDefaultFigure();

        for (Figure comp : arr) {
            comp.draw();
        }
    }
}
