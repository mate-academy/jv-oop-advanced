package core.basesyntax.figuretype;

import core.basesyntax.figure.Area;
import core.basesyntax.figure.Draw;
import core.basesyntax.figure.Figure;
import java.util.Locale;

public class Square extends Figure implements Area, Draw {
    private int side;

    @Override
    public String getArea() {
        return String.format(Locale.ROOT,"%.1f", (double) side * side);
    }

    @Override
    public void toDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, side: ")
                .append(getSide()).append(" units, color: ").append(getColor());
        System.out.println(builder.toString());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
