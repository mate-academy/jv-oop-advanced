package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figure = new Figure[6];
        for (int i = 0; i < figure.length; i++) {
            if (i <= 2) {
                figure[i] = new Circle();
            } else {
                figure[i] = FigureSupplier.getRandomFigure();
            }
            figure[i].drawTheFigure(); // Викликаємо метод на об'єкті фігури
        }
    }
}
