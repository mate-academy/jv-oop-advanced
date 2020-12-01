package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 *
 * Solve the task using OOP principles
 *
 * Task:
 *
 *     There are some figures of the following types: square, rectangle, right triangle, circle, isosceles trapezoid.
 *     We can draw each figure, and obtain its area and color.
 *     Each figure should have unique method: return the radius, hypotenuse length, side length, etc.
 *     We need to generate an array of figures with random parameters, number of objects in the array is also unknown.
 *     After generating the array, we need to display the entire list of objects that we have, for example:
 *
 *  Shape: square, area: 25 sq. units, side length: 5 units, color: blue
 *  Figure: triangle, area: 12.5 sq. units, hypotenuse: 7.1 units, color: yellow
 *
 */
public class MyOwnClass {

    public static void main(String[] args) {

        Figure circle = new Circle(FigureGenerator.getRandomColor(), FigureGenerator.getRandomNumber());
    }

}
