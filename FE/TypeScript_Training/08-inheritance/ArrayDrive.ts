import { Circle } from "./Cricle";
import { Rectangle } from "./Rectangle";
import { Shape } from "./Shape";


let myShape = new Shape(10, 15);
let myCricle = new Circle(10, 20, 5);
let myRectangle = new Rectangle(2, 3, 8, 7);


// declare an array shape ... initail empty
let theShapes: Shape[] = [];

// add the shape to array
theShapes.push(myShape);
theShapes.push(myCricle);
theShapes.push(myRectangle);

for(let tempShape of theShapes){
    console.log(tempShape);
}