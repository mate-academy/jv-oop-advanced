package core.creatorClasses;

import core.figureClasses.*;
import core.interfaces.Constants;

import java.util.Random;

public class FigureSupplier implements Constants {
    public Figure getRandomFigure(){
        Random random  = new Random();
        String figure = FIGURE[random.nextInt(FIGURE_NUMBER)];

        switch (figure) {
            case "circle":
                 new Circle("circle", getColor(), random.nextInt(NUMBER_SIZE));
            case "isosceles trapezoid":
                return new IsoscelesTrapezoid("isosceles trapezoid", getColor(), random.nextInt(NUMBER_SIZE),
                        random.nextInt(NUMBER_SIZE), random.nextInt(NUMBER_SIZE));
            case "rectangle":
                return new Rectangle("rectangle", getColor(), random.nextInt(NUMBER_SIZE),
                        random.nextInt(NUMBER_SIZE));
            case "right triangle":
                return new RightTriangle("right triangle", getColor(), random.nextInt(NUMBER_SIZE),
                        random.nextInt(NUMBER_SIZE));
            default:
                return new Square("square", getColor(), random.nextInt(NUMBER_SIZE));
        }
    }

    private String getColor(){
        ColorSupplier colorFigure = new ColorSupplier();
        return colorFigure.getRandomColor();
    }
}
