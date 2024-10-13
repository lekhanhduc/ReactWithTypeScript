class Customer2 {
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

let myCustomer2 = new Customer2("Le", "Duc");
console.log(myCustomer1.firstName)
console.log(myCustomer1.lastName);

