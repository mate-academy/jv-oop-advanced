package core.basesyntax;

public class Square extends Figure implements Properties {
    private String name = "Square";
    private String color;
    private double side;

    Square(){
    }

    Square(int radius, String color) {
        this.side = radius;
        this.color = color;
    }

    public double countArea() {
        return side * side;
    }

    public void getInfo() {
        System.out.println("Figure: " + this.name + ", area: " + this.countArea()
                + " sq.un., side: " + this.side + " units, color: " + this.color + ".");
    }

}
