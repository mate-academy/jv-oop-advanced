package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(10,Color.WHITE.name());
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        String nameFigure = FigureList.values()[index].toString().toLowerCase();
        String color = new ColorSupplier().getRandomColor();
        if (nameFigure.equals("circle")) {
            int randomFirstValue = random.nextInt(10) + 1;
            return new Circle(randomFirstValue, color);
        }
        if (nameFigure.equals("square")) {
            int randomFirstValue = random.nextInt(10) + 1;
            return new Square(randomFirstValue, color);
        }
        if (nameFigure.equals("right_triangle")) {
            int randomFirstValue = random.nextInt(10) + 1;
            return new RightTriangle(randomFirstValue, color);
        }
        if (nameFigure.equals("rectangle")) {
            int randomFirstValue = random.nextInt(10) + 1;
            int randomSecondValue = random.nextInt(10) + 1;
            return new Rectangle(randomFirstValue, randomSecondValue, color);
        }
        int randomFirstValue = random.nextInt(10) + 1;
        int randomSecondValue = random.nextInt(10) + 1;
        int randomThreeValue = random.nextInt(10) + 1;
        return new IsoscelesTrapezoid(randomFirstValue, randomSecondValue,
                    randomThreeValue, color);
    }
}
