package core.basesyntax;

public class Square extends Figure implements Area {
    private final int firstLag;

    public Square(int firstLag, String color) {
        this.firstLag = firstLag;
        super.setColor(color);
    }

    @Override
    public Double getArea() {
        return (double)firstLag * firstLag;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + this.getArea() + " sq.units, firstLag: " + firstLag + " units, color: " + super.getColor();
    }
}
