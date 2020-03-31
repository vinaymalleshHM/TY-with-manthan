class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
    getName() {
        return this.name
    }
}
const person1 = new Person("Anushka", 34)
const person2 = new Person("Shruti", 30)
console.log(person1.name)
let pName = person2.getName();
console.log("Person2 name ", pName)


console.log("**************************")
class Teacher extends Person {
    constructor(name, age, subject) {
        super(name, age)
        this.subject = subject
    }
    getSubject() {
        return this.subject
    }
}
const teacher1 = new Teacher("guru", 23, ["english", "maths"])
const subj = teacher1.getSubject();
console.log(subj)