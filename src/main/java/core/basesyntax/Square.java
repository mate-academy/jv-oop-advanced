package core.basesyntax;

class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ")
                .append(" the side is of length: ")
                .append(side)
                .append(" the area is ")
                .append(getArea())
                .append(" and the color is ")
                .append(color);
        System.out.println(builder.toString());
    }
}
