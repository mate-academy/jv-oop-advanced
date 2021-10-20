package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Colors;

public class Square extends Figure {

    private final int side;

    public Square(Colors figureColor, int side) {
        super(figureColor);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: Square;\n"
                + "Side: " + side
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getFigureColor() + "\n\n";
    }
}
