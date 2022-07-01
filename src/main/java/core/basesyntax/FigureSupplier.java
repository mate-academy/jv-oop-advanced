package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int Default_Circle_Rradous = 10;
    private final Color Default_Circle_Color = Color.WHITE;
    private final int Max_Random_Figures_Size = 100;
    private Random randomValue = new Random();
    private ColorSupplier colorSupp = new ColorSupplier();

    public Figure getRundomFigure() {
        Figure figure = null;
        int index = randomValue.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                figure = getRandomCircle();
                break;
            case ISOSCELESTRAPEZOID:
                figure = getRandomIsoscelesTrapezoid();
                break;
            case RECTANGLE:
                figure = getRandomRectangle();
                break;
            case RIGHTTRIANGLE:
                figure = getRandomRightTriangle();
                break;
            case SQUARE:
                figure = getRandomSquare();
                break;
            default:break;
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(Default_Circle_Color, Default_Circle_Rradous);
    }

    private Figure getRandomCircle() {
        return new Circle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(Max_Random_Figures_Size));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupp.getRandomColor(),
                randomValue.nextInt(Max_Random_Figures_Size),
                randomValue.nextInt(Max_Random_Figures_Size),
                randomValue.nextInt(Max_Random_Figures_Size));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(Max_Random_Figures_Size),
                randomValue.nextInt(Max_Random_Figures_Size));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupp.getRandomColor(),
                randomValue.nextInt(Max_Random_Figures_Size),
                randomValue.nextInt(Max_Random_Figures_Size));
    }

    private Figure getRandomSquare() {
        return new Square(
                colorSupp.getRandomColor(),
                randomValue.nextInt(Max_Random_Figures_Size));
    }
}
