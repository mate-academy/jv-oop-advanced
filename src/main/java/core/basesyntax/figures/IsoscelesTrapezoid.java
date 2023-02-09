package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(int firstBase, int secondBase, int height) {
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    public int getFirstBase() {
        return firstBase;
    }

    public int getSecondBase() {
        return secondBase;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        int sumOfBase = firstBase + secondBase;
       return  (sumOfBase / 2) * 2;
    }
}
