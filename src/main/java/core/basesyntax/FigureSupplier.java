package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandom() {
        Figure[] figure = {
                new Circle(random.nextDouble(), colorSupplier.getRandomColor()),
                new RightTriangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor()),
                new Rectangle(random.nextDouble(),
                        random.nextDouble(), colorSupplier.getRandomColor()),
                new Square(random.nextDouble(), colorSupplier.getRandomColor()),
                new IsoscelesTrapezoid(random.nextDouble(),
                        random.nextDouble(), random.nextDouble(), colorSupplier.getRandomColor())
        };
        return figure[random.nextInt(figure.length)];
    }

    public Figure getDefaultFigure() {
        return new Figure();
    }

    private static class ColorSupplier {
        private final Color[] colors = Color.values();
        private final Random randomColor = new Random();

        public String getRandomColor() {
            return colors[randomColor.nextInt(colors.length)].name();
        }
    }
}
