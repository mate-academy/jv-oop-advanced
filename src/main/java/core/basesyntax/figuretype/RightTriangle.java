package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;
import java.util.Locale;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {
        setName("right triangle");
    }

    @Override
    public String getArea() {
        return String.format(Locale.ROOT, "%.1f", (double) firstLeg / 2 * secondLeg);
    }

    @Override
    public void toDraw() {
        StringBuilder informationBuilder = new StringBuilder();
        informationBuilder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, first leg: ")
                .append(getFirstLeg()).append(" units, second leg: ")
                .append(getSecondLeg()).append(" units, color: ").append(getColor());
        System.out.println(informationBuilder.toString());
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }
}
