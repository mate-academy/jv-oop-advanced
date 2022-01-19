package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public Figure getRandomFigure() {
        Figure result;
        Random random = new Random();
        final int randomLength1 = random.nextInt(9) + 1;
        final int randomLength2 = random.nextInt(9) + 1;
        final int randomLength3 = random.nextInt(9) + 1;
        String name = FigureName
                .values()[random.nextInt(FigureName.values().length)]
                .toString()
                .toLowerCase();
        ColorSupplier colorSupplier = new ColorSupplier();
        String color = colorSupplier.getRandomColor().toLowerCase();

        switch (name) {
            case "square" :
                result = new Square(name, color, randomLength1);
                break;
            case "rectangle" :
                result = new Rectangle(name, color, randomLength1, randomLength2);
                break;
            case "right_triangle" :
                result = new RightTriangle(name, color, randomLength1, randomLength2);
                break;
            case "circle" :
                result = new Circle(name, color, randomLength1);
                break;
            default:
                result = new IsoscelesTrapezoid(
                        name,
                        color,
                        randomLength1,
                        randomLength2,
                        randomLength3
                        );
                break;
        }
        return result;
    }

    public Figure getDefaultFigure() {
        return new Circle("circle", "WHITE", 10);
    }
}

