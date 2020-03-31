let person = {
    name: "shalini",
    age: 20,
    hobbies: ["singing", "dancing"]
}
let { name, hobbies } = person
console.log("Hobbies ", hobbies)

console.log("****************************")
displayName(person)  //function name
function displayName({ name, hobbies }) {
    console.log(name)
    console.log(hobbies)
}
console.log("============================")
// let hobbies = ["singing","Dancing","jumping"]
// let [hobby1,hobby2] = hobbies;
// console.log(hobby2)
// console.log(hobby1)
console.log("============================")
let items = [{
    id: 1,
    name: "bag",
    price: 400
},
{
    id: 2,
    name: "watch",
    price: 500
}

]
console.log("Item ", items)
items[0].id = 5;
console.log("After Modification ", items)
var item = { ...items[0] }
console.log("Item 0 ", item)
item.id = 20;
console.log("Item 0 ", item)
console.log("Items ", items)

let address = {
    city: "banglore",
    pincode: 560010
}
console.log("////////////////")
let personAddress = { ...person, ...address }
console.log(personAddress)

var arr = [10, 20, 40, 50]
var arr1 = [60, 70, 80]
var arrays = [...arr, ...arr1]
console.log("Array Data", arrays)

console.log("+++++++++++++++++++++++++++++")
function sum(...args){
    let value = 0;

    for (let i = 0; i < args.length; i++) {
        value += args[i]
        console.log(value)
    }
}
sum(12,21,5,6,5,656,56)