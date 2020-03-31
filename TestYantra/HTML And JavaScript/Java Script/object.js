var person = {
    firstName:"Venky",
    lastName : "a",
    age:35,
    gender:"F",
    eat : function(){
        console.log("Eating Biriyani");
    },
    getFullName : function(){
        return this.firstName+" "+this.lastName;
    }
}

var firstName = person.firstName;
var lastName = person.lastName;
var age = person.lastName;
var gender = person.gender;
      person.eat();
var getFullName = person.getFullName();
console.log("first Name:"+firstName);
console.log("Lirst Name:"+lastName);
console.log("age:"+age);
console.log("Gender:"+gender);
console.log("Full Name:"+getFullName);