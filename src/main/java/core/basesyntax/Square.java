package core.basesyntax;

import java.awt.*;
import java.util.Random;

public class Square extends Figure implements FigureInterface, DrawFigure {
    private final int side;

    public Square(String color ,int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }


    @Override
    public void drawFigure() {
        System.out.println("Figure: Square"
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side A, B: "
                + side
                + "\n"
                + "Color: "
                + getColor()
                + "\n");
    }

    @Override
    public String toString() {
        return "Figure: Square"
                + "\n"
                + "Figure Area: "
                + getFigureArea()
                + "\n"
                + "Side A, B: "
                + side
                + "\n"
                + "Color: "
                + getColor()
                + "\n";
    }
}
