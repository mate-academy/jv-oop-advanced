package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        FigureSupplier generator = new FigureSupplier();
        Figure[] figures = new Figure[randomNumber];
        for (int i = 0; i < figures.length; i++) {
            Figure randomFigure = generator.getRandomFigure();
            figures[i] = randomFigure;

        }
        for (Figure figure : figures) {
            figure.draw();
        }
        System.out.println(figures);
    }
}

