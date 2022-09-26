package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    public static final int BOUND = 100;
    private int firstSide;
    private int secondSide;
    private int height;

    @Override
    public void setRandomProperties() {
        super.setRandomProperties();
        this.firstSide = random.nextInt(BOUND);
        this.secondSide = random.nextInt(BOUND);
        this.height = random.nextInt(BOUND);
    }

    @Override
    public double getArea() {
        return height * ((firstSide + secondSide) / 2);
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + getArea()
                + " sq.units, first side: " + firstSide
                + " units, second side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
