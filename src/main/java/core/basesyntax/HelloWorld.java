package core.basesyntax;

import java.util.Random;

interface Figures_Beh {

    final String default_color = "White";

    // all are the abstract methods.
    Figure getRandomFigure();
    Figure getDefaultFigure();

}
abstract class Figure {
    protected double square;
    private ColorSupplier cs;
    protected String color;

    public Figure(ColorSupplier cs) {
        this.cs = cs;
        this.color = this.cs.getRandomColor();
    }

    public Figure(String color) {
        this.cs = new ColorSupplier();
        this.color = color;
    }
    abstract public void draw();

}

class Square extends Figure {
    private double side;

    public Square(double side, ColorSupplier cs) {
        super(cs);
        this.side = side;
        this.square = side * side;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: " + String.format("%.2f", square) +
            " sq.units, side:" + String.format("%.2f", side) + " units, color: " + color);
    }
}

class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2, ColorSupplier cs) {
        super(cs);
        this.side1 = side1;
        this.side2 = side2;
        this.square = side1 * side2;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: " + String.format("%.2f", square) +
            " sq.units, side1:" + String.format("%.2f", side1) + ", side2:" + String.format("%.2f", side2) +
            " units, color: " + color);
    }
}

class Circle extends Figure {
    private double radius;
    final private double PI = 3.14159265359;

    public Circle(double radius, ColorSupplier cs) {
        super(cs);
        this.radius = radius;
        squareCalc();
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
        squareCalc();
    }

    private void squareCalc() {
        this.square = PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: " + String.format("%.2f", square) +
            " sq.units, radius:" + String.format("%.2f", radius) + " units, color: " + color);
    }
}

class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, ColorSupplier cs) {
        super(cs);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.square = (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: " + String.format("%.2f", square) +
            " sq.units, firstLeg:" + String.format("%.2f", firstLeg) +
            ", secondLeg:" + String.format("%.2f", secondLeg) + " units, color: " + color);
    }
}
class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(double firstLeg, double secondLeg, double height, ColorSupplier cs) {
        super(cs);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        this.square = ((firstLeg + secondLeg) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + ": square, area: " + String.format("%.2f", square) +
            " sq.units, firstLeg:" + String.format("%.2f", firstLeg) + ", secondLeg:" + String.format("%.2f", secondLeg) +
            ", height:" + String.format("%.2f", height) + " units, color: " + color);
    }
}

class FigureSupplier implements Figures_Beh {
    enum FiguresShape {
        Square,
        Rectangle,
        RightTriangle,
        Circle,
        IsoscelesTrapezoid;
    }

    private ColorSupplier cs;

    public FigureSupplier() {
        this.cs = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        Random random = new Random();
        FiguresShape[] figure_shape = FiguresShape.values();
        Figure fg = null;
        switch (figure_shape[random.nextInt(figure_shape.length - 1)].toString()) {
        case "Square": {
            fg = new Square(random.nextDouble()*100, cs);
            break;
        }
        case "Rectangle": {
            fg = new Rectangle(random.nextDouble()*100, random.nextDouble()*100, cs);
            break;
        }
        case "RightTriangle": {
            fg = new RightTriangle(random.nextDouble()*100, random.nextDouble()*100, cs);
            break;
        }
        case "Circle": {
            fg = new Circle(random.nextDouble()*100, cs);
            break;
        }
        case "IsoscelesTrapezoid": {
            fg = new IsoscelesTrapezoid(random.nextDouble()*100, random.nextDouble()*100, random.nextDouble()*100, cs);
            break;
        }

        }
        return fg;

    }

    public Figure getDefaultFigure() {
        return new Circle(10.0, default_color);
    }

}

class ColorSupplier {
    enum Colors {
        White,
        Aquamarine,
        Azure,
        BurlyWood,
        CadetBlue,
        Gainsboro,
        Gold,
        Gray,
        Khaki,
        LawnGreen,
        LightGreen,
        LightSkyBlue,
        Linen,
        MediumOrchid,
        MediumPurple,
        MistyRose,
        Olive,
        OliveDrab,
        Orange,
        OrangeRed,
        Orchid,
        PaleTurquoise,
        Peru,
        Pink,
        Plum,
        RoyalBlue,
        SandyBrown,
        SeaGreen,
        SteelBlue;
    }

    public String getRandomColor() {
        Random random = new Random();
        Colors[] colors = Colors.values();
        return colors[random.nextInt(colors.length - 1)].toString();
    }
}

public class HelloWorld {
  public static void main(String[] args) {

        Figure[] figures_arr = new Figure[6];
        FigureSupplier fs = new FigureSupplier();
        for (int i = 0; i < figures_arr.length; i++) {
            figures_arr[i] = i < figures_arr.length / 2 ? fs.getRandomFigure() : fs.getDefaultFigure();
            figures_arr[i].draw();
        }
  }
  
}
