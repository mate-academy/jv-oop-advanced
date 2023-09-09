package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, InformationDrawer {
    private final int base;
    private final int height;

    public RightTriangle(Colors color, int base, int height) {
        this.color = color;
        this.base = base;
        this.height = height;
    }

    @Override
    public int areaCalculator() {
        return base * height / 2;
    }

    @Override
    public void informationCalculator() {
        String triangleInformation = String.valueOf(new StringBuilder()
                .append("Figure: right triangle, area: ")
                .append(areaCalculator())
                .append("sq.units, base: ")
                .append(this.base)
                .append(" units, height: ")
                .append(this.height)
                .append(" units, color: ")
                .append(color));
        System.out.println(triangleInformation);
    }

}
