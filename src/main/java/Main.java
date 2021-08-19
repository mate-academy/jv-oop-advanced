public class Main {
    public static void main(String[] args) {
        int countFigure = (int) (Math.random() * (10 + 1) + 1);
        int[] figures = new int[countFigure];
        for (int i = 0; i < figures.length; i++) {
            FigureSupplier figureSupplier = new FigureSupplier();
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
        }

    }
}
