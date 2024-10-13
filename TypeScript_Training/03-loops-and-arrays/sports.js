var sportOne = ["Hello", "Hi", "Khanh Duc"];
for (var i = 0; i < sportOne.length; i++) {
    console.log(sportOne[i]);
}
for (var _i = 0, sportOne_1 = sportOne; _i < sportOne_1.length; _i++) {
    var temSport = sportOne_1[_i];
    console.log(temSport);
}
for (var _a = 0, sportOne_2 = sportOne; _a < sportOne_2.length; _a++) {
    var temSport = sportOne_2[_a];
    if (temSport == 'Khanh Duc') {
        console.log(temSport);
    }
}
