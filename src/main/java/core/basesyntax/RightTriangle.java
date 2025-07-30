package core.basesyntax;

public class RightTriangle extends Figure implements Calculable_Area {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(" Right triangle", color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(figureType).append(", ")
                .append("area: ")
                .append(getArea())
                .append(" square units, ");
        for (String property : getProperties()) {
            stringBuilder.append(property).append(" ");
        }
        stringBuilder.append("color: ").append(color);
        System.out.println(stringBuilder.toString());
    }

    private String[] getProperties() {
        return new String[]{
                "first leg: " + firstLeg + " units",
                "second leg: " + secondLeg + " units"
        };
    }
}
