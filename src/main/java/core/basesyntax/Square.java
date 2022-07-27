package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int a, String color) {
        this.side = a;
        this.color = color;
    }

    public void setSide(int a) {
        this.side = a;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSide() {
        return this.side;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t side - " + this.side + " units.";
    }
}
