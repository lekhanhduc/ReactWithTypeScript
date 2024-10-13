"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const Cricle_1 = require("./Cricle");
const Rectangle_1 = require("./Rectangle");
const Shape_1 = require("./Shape");
let myShape = new Shape_1.Shape(10, 15);
let myCricle = new Cricle_1.Circle(10, 20, 5);
let myRectangle = new Rectangle_1.Rectangle(2, 3, 8, 7);
// declare an array shape ... initail empty
let theShapes = [];
// add the shape to array
theShapes.push(myShape);
theShapes.push(myCricle);
theShapes.push(myRectangle);
for (let tempShape of theShapes) {
    console.log(tempShape);
}
