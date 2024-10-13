let review : number[] = [5,4,3,2,7,8];
let total: number = 0;

for(let i = 0; i < review.length; i++){
    console.log(review[i]);
}

for(let i = 0; i < review.length; i++){
    total += review[i];
}

console.log(total);