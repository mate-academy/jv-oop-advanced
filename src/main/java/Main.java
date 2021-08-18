public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure figure = figureSupplier.getRandomFigure();
        figure.draw();
    }
}
