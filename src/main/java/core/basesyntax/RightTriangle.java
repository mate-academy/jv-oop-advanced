package core.basesyntax;

import java.text.DecimalFormat;

public class RightTriangle extends Figure {
    private final int legALength;
    private final int legBLength;

    public RightTriangle(String name, Color color, int legALength, int legBLength) {
        super(name, color);
        this.legALength = legALength;
        this.legBLength = legBLength;
    }

    @Override
    public void draw() {
        DecimalFormat formatter = new DecimalFormat("0.#");
        System.out.println("Figure: " + getName()
                + ", area: " + formatter.format(getArea())
                + " sq. units, leg A length: " + legALength
                + " units, leg B length: " + legBLength
                + " units, color: " + getColor());
    }

    @Override
    double getArea() {
        return (legALength + legBLength) / 2.0;
    }
}
