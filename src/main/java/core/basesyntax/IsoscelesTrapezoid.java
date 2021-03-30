package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {

    private final int height;
    private final int baseLength;
    private final int topLength;

    public IsoscelesTrapezoid(String name, Color color, int height, int baseLength, int topLength) {
        super(name, color);
        this.height = height;
        this.baseLength = baseLength;
        this.topLength = topLength;
    }

    @Override
    public void draw() {
        DecimalFormat formatter = new DecimalFormat("0.#");
        System.out.println("Figure: " + getName()
                + ", area: " + formatter.format(getArea())
                + " sq. units, height: " + height
                + " units, base length: " + baseLength
                + " units, top length: " + topLength
                + " units, color: " + getColor());
    }

    @Override
    double getArea() {
        return (height / 2.0) * (topLength + baseLength);
    }
}
