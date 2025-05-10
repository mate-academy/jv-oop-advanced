public class Main {
    private static final int MAX_ARRAY_LENGTH = 10;

    public static void main(String[] args) {
        int countFigure = (int) (Math.random() * (MAX_ARRAY_LENGTH) + 1);
        int[] figures = new int[countFigure];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
        }
    }
}
