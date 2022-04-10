package core.basesyntax;

public class Square extends Figure implements FigureBehaviour {
    private double side;

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                            + this.calculateArea()
                            + " sq.units, side: "
                            + this.getSide()
                            + " units, color: "
                            + this.getColor()
                            + "\n");
    }

    @Override
    public Square setRandomParameters() {
        Square square = new Square();
        square.side = Main.getRandom().nextInt(maxParameterLength);
        return square;
    }

}
