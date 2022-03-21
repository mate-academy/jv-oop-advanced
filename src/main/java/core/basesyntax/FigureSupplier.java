package core.basesyntax;

import java.util.Random;

class FigureSupplier extends Figure {
    public FigureSupplier() {
        super();
    }

    public Figure getDefaultFigure() {
        return new Circle("circle",10,"white");
    }

    public Figure getRandomFigure() {
        final Figure randomFigure = new FigureSupplier();

        int index = new Random().nextInt(FigureList.values().length);
        String nameFigure = FigureList.values()[index].toString().toLowerCase();

        String colorSupplier = new ColorSupplier().getRandomColor();

        Random random = new Random();
        int randomFirstValue = random.nextInt(10) + 1;
        int randomSecondValue = random.nextInt(10) + 1;
        int randomThreeValue = random.nextInt(10) + 1;

        if (nameFigure.equals("circle")) {
            return new Circle(nameFigure, randomFirstValue, colorSupplier);
        }

        if (nameFigure.equals("square")) {
            return new Square(nameFigure,randomFirstValue, colorSupplier);
        }

        if (nameFigure.equals("right_triangle")) {
            return new RightTriangle(nameFigure, randomFirstValue, colorSupplier);
        }

        if (nameFigure.equals("rectangle")) {
            return new Rectangle(nameFigure, randomFirstValue, randomSecondValue, colorSupplier);
        }

        if (nameFigure.equals("isosceles_trapezoid")) {
            return new IsoscelesTrapezoid(nameFigure, randomFirstValue, randomSecondValue,
                    randomThreeValue, colorSupplier);
        }

        return randomFigure;
    }
}
