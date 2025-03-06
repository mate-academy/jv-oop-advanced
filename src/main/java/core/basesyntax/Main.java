package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }

    public static class FigureSupplier {
        private ColorSupplier colorSupplier = new ColorSupplier();

        public Figure getRandomFigure() {
            Random random = new Random();
            int figureType = random.nextInt(5);
            String color = colorSupplier.getRandomColor();

            return switch (figureType) {
                case 0 -> new Square(color, random.nextDouble() * 10);
                case 1 -> new Rectangle(color, random.nextDouble() * 10, random.nextDouble() * 10);
                case 2 -> new RightTriangle(color, random.nextDouble() * 10,
                        random.nextDouble() * 10);
                case 3 -> new Circle(color, random.nextDouble() * 10);
                case 4 ->
                        new IsoscelesTrapezoid(color, random.nextDouble() * 10, random.nextDouble()
                                * 10, random.nextDouble() * 10);
                default -> getDefaultFigure();
            };
        }

        public Figure getDefaultFigure() {
            return new Circle("White", 10);
        }
    }
}

