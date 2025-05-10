public class Main {
    public static final int AMOUNT_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[AMOUNT_OF_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < AMOUNT_OF_FIGURES; i++) {
            if (i < (AMOUNT_OF_FIGURES / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
                System.out.println(figures[i].printInfo());
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                System.out.println(figures[i].printInfo());
            }
        }
    }
}
