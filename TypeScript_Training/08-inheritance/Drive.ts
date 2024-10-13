import { Circle } from "./Cricle";
import { Rectangle } from "./Rectangle";
import { Shape } from "./Shape";


let myShape = new Shape(10, 15);
console.log(myShape.getInfo());

let myCricle = new Circle(10, 20, 5);
console.log(myCricle.getInfo());

let myRectangle = new Rectangle(2, 3, 8, 7);
console.log(myRectangle.getInfo());