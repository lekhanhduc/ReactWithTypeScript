import { CricketCoach } from "./CricketCoach";
import { GoftCoach } from "./GoftCoach";


let myCricketCoach = new CricketCoach();
let myGolf = new GoftCoach();

let theCoaches : Coach[] = [];
theCoaches.push(myCricketCoach);
theCoaches.push(myGolf);

for(let tempCoach of theCoaches){
    console.log(tempCoach.getDailyWorkout())
}