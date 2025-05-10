package core.figures;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private final int baseA;
    private final int baseB;
    private final int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
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
    public String draw() {
        return "Figure: Square;\n"
                + "BaseA: " + baseA + ", BaseB: " + baseB + ", Height: " + height
                + ";\n" + "Area: " + new DecimalFormat("#.##").format(calculateArea())
                + ";\n" + "Color: " + getColor() + "\n\n";
    }
}
