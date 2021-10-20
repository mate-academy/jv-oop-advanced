package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Colors;

public class IsoscelesTrapezoid extends Figure {

    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(Colors figureColor, int baseA, int baseB, int height) {
        super(figureColor);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (double) ((baseA + baseB) / 2) * height;
    }

    @Override
    public String drawFigure() {
        return "Figure: Square;\n"
                + "BaseA: " + baseA + ", BaseB: " + baseB + ", Height: " + height
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getFigureColor() + "\n\n";
    }
}
