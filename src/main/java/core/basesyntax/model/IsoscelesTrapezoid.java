package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {

    private final int leg;
    private final int shortBase;
    private final int longBase;

    public IsoscelesTrapezoid(String color, int leg, int shortBase, int longBase) {
        super(color);
        this.leg = leg;
        this.shortBase = shortBase;
        this.longBase = longBase;
    }

    @Override
    public double getArea() {
        double height = calculateHeight();
        return Math.round((shortBase + longBase) * height / TWO);
    }

    private double calculateHeight() {
        return Math.pow(leg, TWO) - Math.pow((longBase - shortBase), TWO) / FOUR;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure:");
        builder.append(" isosceles trapezoid").append(COMMA)
                .append(" area: ").append(getArea()).append(WORD_SEPARATOR)
                .append("sq.units").append(COMMA)
                .append(" leg: ").append(leg).append(WORD_SEPARATOR)
                .append("units").append(COMMA)
                .append(" shortBase: ").append(shortBase).append(WORD_SEPARATOR)
                .append("units").append(COMMA)
                .append(" longBase: ").append(longBase).append(WORD_SEPARATOR)
                .append("units").append(COMMA)
                .append(" color: ").append(color);
        System.out.println(builder);
    }
}
