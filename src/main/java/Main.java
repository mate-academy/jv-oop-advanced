public class Main {
    static final int MAX_RANDOM_VALUE = 10;

    public static void main(String[] args) {
        int number = (int) (Math.random() * MAX_RANDOM_VALUE);
        Figure[] figures = new Figure[number];
        for (int i = 0; i < number; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
