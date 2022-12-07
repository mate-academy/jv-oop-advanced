package core.basesyntax.figures;

public class Square extends Figure {
    int side = 5;
    @Override
    public int area() {
        return side;
    }
    public void print() {
        System.out.println("Figure: square, area: " + this.area() + " side: "
                + this.side + " units, color: " + this.color);
    }
}
