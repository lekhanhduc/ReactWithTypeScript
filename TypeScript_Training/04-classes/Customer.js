var Customer = /** @class */ (function () {
    function Customer(theFirst, theLast) {
        this.firstName = theFirst;
        this.lastName = theLast;
    }
    return Customer;
}());
var myCustomer = new Customer("Le Khanh", "Duc");
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
