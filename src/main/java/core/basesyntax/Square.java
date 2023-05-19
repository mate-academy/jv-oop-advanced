package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.setName("square");
        this.setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double obtainArea() {
        return side * side;
    }

    @Override
    public void draw() {
        super.draw();
        StringBuilder builder = new StringBuilder();
        builder.append(", side: ");
        builder.append(this.getSide());
        builder.append(" units");
        builder.append(", color: ");
        builder.append(this.getColor());
        System.out.println(builder.toString());
    }
}
