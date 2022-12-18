package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    int randomNumber = RANDOM.nextInt(5);
    double figuresSidesNumber = RANDOM.nextInt(100);

    private Square createSquare(){
        return new Square(COLOR_SUPPLIER.getRandomColor(),
                figuresSidesNumber);
    }

    private Rectangle createRectangle(){
        return new Rectangle(COLOR_SUPPLIER.getRandomColor(),
                figuresSidesNumber,
                figuresSidesNumber);
    }

    private RightTriangle createRightTriangle(){
        return new RightTriangle(COLOR_SUPPLIER.getRandomColor(),
                figuresSidesNumber,
                figuresSidesNumber);
    }

    private Circle createCircle(){
        return new Circle(COLOR_SUPPLIER.getRandomColor(),
                figuresSidesNumber);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(){
        return new IsoscelesTrapezoid(COLOR_SUPPLIER.getRandomColor(),
                figuresSidesNumber,
                figuresSidesNumber,
                figuresSidesNumber);
    }

    public Figure getRandomFigure() {
        Figure figure;


        switch (randomNumber) {
            case 0 : {
                figure = createSquare();
                break;
            }
            case 1 : {
                figure = createRectangle();
                break;
            }
            case 2 : {
                figure = createRightTriangle();
                break;
            }
            case 3 : {
                figure = createCircle();
                break;
            }
            case 4 : {
                figure = createIsoscelesTrapezoid();
                break;
            }
            default: {
                figure = new Square(COLOR_SUPPLIER.getRandomColor(),
                        figuresSidesNumber);
            }
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, 10.0);
    }
}
