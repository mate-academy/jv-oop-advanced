package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: isosceles trapezoid, ")
                .append("area: " + calculateArea() + " sq. units,")
                .append(" first base: " + firstBase + " units,")
                .append(" second base: " + secondBase + " units,")
                .append(" height: " + height + " units,")
                .append(" color: " + getColor());
        System.out.println(builder);
    }

    @Override
    public double calculateArea() {
        return Math.floor((double) (firstBase + secondBase) / 2 * height) * 10.0 / 10.0;
    }
}
