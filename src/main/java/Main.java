import java.util.Random;

public class Main {
    private static final int MAX_AMOUNT_OF_FIGURES = 10;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[random.nextInt(MAX_AMOUNT_OF_FIGURES)];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
