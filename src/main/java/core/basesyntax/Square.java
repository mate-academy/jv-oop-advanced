package core.basesyntax;

public class Square extends Figure implements FigureBehaviour {
    double side;

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
                            + this.side
                            + " units, color: "
                            + this.color
                            + "\n");
    }

    @Override
    public Square setRandomParameters() {
        Square square = new Square();
        square.side = Main.random.nextInt(MAX_PARAMETER_LENGTH);
        return square;
    }

}
