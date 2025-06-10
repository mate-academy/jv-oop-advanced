package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[6]; // Массив из 6 фигур

        // Заполняем первую половину случайными фигурами
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        // Заполняем вторую половину стандартными фигурами
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        // Выводим информацию о каждой фигуре
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
