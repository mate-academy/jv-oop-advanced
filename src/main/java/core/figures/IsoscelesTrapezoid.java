package core.figures;

import java.text.DecimalFormat;
import randomizers.sourcerand.Color;

public class IsoscelesTrapezoid extends Figure {
    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(Color color, int baseA, int baseB, int height) {
        super(color);
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
                + ";\n" + "Color: " + getColor() + "\n\n";
    }
}
