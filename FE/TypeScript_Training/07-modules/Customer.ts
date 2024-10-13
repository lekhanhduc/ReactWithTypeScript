class Customer3 {
    constructor(private _firstName: string ,
        private _lastName: string)
    {}

    public get firstName() : string {
        return this._firstName;
    }

    public set firstName (value: string){
        this._firstName = value;
    }

    public get lastName() : string {
        return this._lastName;
    }

    public set lasttName (value: string){
        this._lastName = value;
    }
}

let myCustomer3 = new Customer3("Le", "Duc");
console.log(myCustomer1.firstName)
console.log(myCustomer1.lastName);

