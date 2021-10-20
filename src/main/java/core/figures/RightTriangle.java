package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Colors;

public class RightTriangle extends Figure {

    private final int sideA;
    private final int sideB;

    public RightTriangle(Colors figureColor, int sideA, int sideB) {
        super(figureColor);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return (double) (sideA * sideB) / 2;
    }

    @Override
    public String drawFigure() {
        return "Figure: RightTriangle;\n"
                + "SideA: " + sideA + ", SideB: " + sideB
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getFigureColor() + "\n\n";
    }
}
