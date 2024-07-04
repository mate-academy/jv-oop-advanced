package core.basesyntax;

public class Main {
    public static void main(String[] args){
        FigureSupplier figureSupplier = new FigureSupplier();
        int arraySize = 6; // Можна змінити на інший розмір
        Figure[] figures = new Figure[arraySize];

        // Заповнення першої половини масиву випадковими фігурами
        for (int i = 0; i < arraySize / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        // Заповнення другої половини масиву стандартними фігурами
        for (int i = arraySize / 2; i < arraySize; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        // Виведення всіх фігур
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
