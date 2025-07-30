package core.basesyntax;

public class Square extends Figure implements Calculable_Area {
    double side;

    public Square(String color, double side) {
        super("Square", color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
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
        return new String[]{"side: " + side + " units"};
    }


}
