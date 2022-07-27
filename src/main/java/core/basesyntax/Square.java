package core.basesyntax;

public class Square extends Figure {
    private int a;

    public Square(int a, String color) {
        this.a = a;
        this.color = color;
    }

    public void setSide(int a) {
        this.a = a;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSide() {
        return this.a;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public int countArea() {
        return a * a;
    }

    @Override
    public String draw() {
        return "Figure: Square\n\tcolor - " + this.color + ";"
                + "\n\t area - " + this.countArea() + " sq. units;"
                + "\n\t side - " + this.a + " units.";
    }
}
