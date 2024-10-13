"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const CricketCoach_1 = require("./CricketCoach");
const GoftCoach_1 = require("./GoftCoach");
let myCricketCoach = new CricketCoach_1.CricketCoach();
let myGolf = new GoftCoach_1.GoftCoach();
let theCoaches = [];
theCoaches.push(myCricketCoach);
theCoaches.push(myGolf);
for (let tempCoach of theCoaches) {
    console.log(tempCoach.getDailyWorkout());
}
