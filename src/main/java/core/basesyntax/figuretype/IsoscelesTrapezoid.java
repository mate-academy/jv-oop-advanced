package core.basesyntax.figuretype;

import core.basesyntax.figure.Area;
import core.basesyntax.figure.Draw;
import core.basesyntax.figure.Figure;
import java.util.Locale;

public class IsoscelesTrapezoid extends Figure implements Area, Draw {
    private int leftSide;
    private int rightSide;
    private int height;

    @Override
    public String getArea() {
        return String.format(Locale.ROOT, "%.1f", (double) ((leftSide + rightSide) / 2) * height);
    }

    @Override
    public void toDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ").append(getName()).append(", area: ")
                .append(getArea()).append(" sq.units, left side: ").append(getLeftSide())
                .append(" units, right side: ").append(getRightSide()).append(" units, height: ")
                .append(getHeight()).append(" units, color: ").append(getColor());
        System.out.println(builder.toString());
    }

    public int getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(int leftSide) {
        this.leftSide = leftSide;
    }

    public int getRightSide() {
        return rightSide;
    }

    public void setRightSide(int rightSide) {
        this.rightSide = rightSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
