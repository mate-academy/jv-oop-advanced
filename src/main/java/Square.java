public class Square extends Figure implements FigureInterface {
    private double side;

    public Square() {
    }

    public Square(String name) {
        super(name);
        this.side = Math.random();
    }

    @Override
    public void draw() {

    }

    @Override
    public double areaValue() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "name='" + this.getName() + '\''
                + ", area=" + this.getArea() + ", color='" + this.getColor() + '\''
                + ", side=" + side
                + '}';
    }
}
