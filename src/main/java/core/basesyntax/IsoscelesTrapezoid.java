package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final int NUMBER_OF_ALL_SIDES = 4;
    private static final int SQUARE_ROOT_VALUE = 2;
    private static final int POWER_VALUE = 2;
    private static final int HALF_DIVIDER = 2;

    private double baseLeg;
    private double topLeg;
    private double sideLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double baseLeg, double topLeg, double sideLeg) {
        super(color.toLowerCase());
        this.baseLeg = baseLeg;
        this.topLeg = topLeg;
        this.sideLeg = sideLeg;
    }

    @Override
    public double calculateArea() {
        height = Math.sqrt((NUMBER_OF_ALL_SIDES * Math.pow(sideLeg, SQUARE_ROOT_VALUE))
                - Math.pow((topLeg > baseLeg ? topLeg - baseLeg : baseLeg - topLeg), POWER_VALUE));
        return ((topLeg + baseLeg) / HALF_DIVIDER) * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, area ")
                .append(String.format("%.2f", calculateArea()))
                .append(" sq. units, baseLeg ").append(baseLeg)
                .append(" units, topLeg ").append(topLeg)
                .append(" units, sideLeg ").append(sideLeg)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
