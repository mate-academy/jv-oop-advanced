package core.basesyntax;

import static core.basesyntax.ColorSupplier.getRandomColor;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawable {
    private int lowerBase;
    private int upperBase;
    private int height;

    public int getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(int lowerBase) {
        this.lowerBase = lowerBase;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(int upperBase) {
        this.upperBase = upperBase;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int GetArea() {
        return ((lowerBase + upperBase) / 2) * height;
    }

    @Override
    public String toDraw() {
        return "Figure: isoscelesTrapezoid, area:" + GetArea()
                + " sq.units , lowerBase: " + getLowerBase() +
                "units , upperBase: " + getUpperBase() +
                "units , height: " + getHeight() +
                "units, color:" + getRandomColor();
    }


}

