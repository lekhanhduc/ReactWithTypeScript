let sportOne: string [] = ["Hello", "Hi", "Khanh Duc"];
for(let i = 0; i < sportOne.length; i++){
    console.log(sportOne[i])
}

for(let temSport of sportOne){
    console.log(temSport);
}


for(let temSport of sportOne){
    if(temSport == 'Khanh Duc'){
        console.log(temSport);
    }
}
