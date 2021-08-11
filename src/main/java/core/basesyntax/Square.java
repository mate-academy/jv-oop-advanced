package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square(String color, int side) {

        super(color);
        this.side = side > 0 ? side : 0;
    }

    @Override
    public double getArea() {
        return this.getSide() * this.getSide();
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append(" Figure: square, area: ")
                .append(this.getArea()).append(" sq.units, side: ")
                .append(this.getSide()).append(" units, color: ")
                .append(this.getColor()).toString());
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
