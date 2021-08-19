package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends ColorSupplier{
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private int figureNumber = random.nextInt(FIGURE_COUNT);
    private int figureLeg = random.nextInt(10);

    public int getFigureLeg() {
        return figureLeg;
    }
    public void setFigureLeg(int figureLeg) {
        this.figureLeg = figureLeg;
    }
    public int getFigureNumber() {
        return figureNumber;
    }
    public void setFigureNumber(int figureNumber) {
        this.figureNumber = figureNumber;
    }

    public Figure getRandomFigure() {
        switch (figureNumber){
            case 1:
                return new Circle(figureLeg, getRandomColor(), "circle");
            case 2:
                return new IsoscelesTrapezoid(figureLeg, figureLeg, figureLeg, getRandomColor(), "trapezoid");
            case 3:
                return new Rectangle(figureLeg, figureLeg, getRandomColor(), "rectangle");
            case 4:
                return new RightTriangle(figureLeg,figureLeg, getRandomColor(),"triangle");
            case 5:
                return new Square(figureLeg, getRandomColor(), "square");
            default:
                break;
        }
        return null;
    }
}