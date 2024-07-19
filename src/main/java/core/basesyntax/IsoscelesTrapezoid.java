package core.basesyntax;

class IsoscelesTrapezoid extends Figure {
    private int top;
    private int bottom;
    private int side;

    public IsoscelesTrapezoid(String color, int top, int bottom, int side) {
        super(color);
        this.side = side;
        this.bottom = bottom;
        this.top = top;
    }

    @Override
    public double getArea() {
        return (top * bottom * side) / 3;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ")
                .append(" the sides are of length: ")
                .append(side)
                .append(", the bottom is of length: ")
                .append(bottom)
                .append(", the top is of length ")
                .append(top)
                .append(" the area is: ")
                .append(getArea())
                .append(" and the color is: ")
                .append(color);
        System.out.println(builder.toString());
    }
}
