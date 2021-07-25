import model.Figure;
import model.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        double a = Math.random();
        double b = Math.random();
        int arrayLength = (int)Math.round(a * b * 1000) + 2;
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }
        for (int i = 0; i < figures.length; i++) {
            figures[i].drow();
        }
    }
}
