package core.basesyntax;

class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: ")
                .append(" the side is of length: ")
                .append(side)
                .append(" and the color is ")
                .append(color);
        System.out.println(builder.toString());
    }
}
