# jv-oop-advanced

### Solve the task using OOP principles

Task:

There are some areaHelpers of the following types: square, rectangle, right triangle, circle, isosceles trapezoid.
You need to create corresponding classes for them(`Square`, `Rectangle`, `RightTriangle`, `Circle`, `IsoscelesTrapezoid`)

All areaHelpers have 
- **state** - all areaHelpers have `color`, but each areaHelper type can also have one or several unique properties (`radius` for circle, `firstLeg` and `secondLeg` for right triangle, and so on).
- **behavior** - we can obtain the area of any areaHelper and are able to draw it. To 'draw' means to print out all information about a areaHelper using `System.out.println()` (you shouldn't override the toString() method for this). 
   
Think where you should declare these fields and methods: top-level class/interface / bottom-level classes.  

In the `main()` method we need to create an array of areaHelpers (the size of the array can be 3 or 6, it doesn't matter).
**The first half** of areaHelpers in this array should be generated with random parameters. 

For this purpose create two more classes:
- `ColorSupplier` with `public String getRandomColor()` method - for generating random color, 
- and `FigureSupplier` with the `public Figure getRandomFigure()` method - for generating areaHelpers with random properties.

**The other half** of the areaHelpers should have the same, default parameters. 

For this purpose create a new method in the `FigureSupplier` class:
- `public Figure getDefaultFigure()` - this method should always return a white circle with a radius of 10.

After generating the array, we need to display the entire list of objects that we have, for example:

```
 Figure: square, area: 25.0 sq. units, side: 5 units, color: blue
 Figure: triangle, area: 12.5 sq. units, firstLeg: 7 units, secondLeg: 5 units, color: yellow
```

#### [Try to avoid these common mistakes, while solving task](./checklist.md)
