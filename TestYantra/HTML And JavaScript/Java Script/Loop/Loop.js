var hobbies = ["Sleeping","Eating","Travelling","Coding","Trekking"]
console.log("--------------using for loop-------------")
for (var i = 0; i <hobbies .length; i++) {
    console.log(hobbies[i])
    
}
console.log("--------------using for of loop-------------")
for (const hobby of hobbies) {
    console.log(hobby)
}
console.log("--------------using for in loop-------------")
for (const index in hobbies) {
    console.log(hobbies[index])
}
console.log("--------------*********************-------------")
var employee = {
    name : 'venky',
    age  : 22,
    color : 'white',
    phoneno : 4546469752,
     hobbies : ["Sleeping","Eating","Travelling","Coding","Trekking"]

}
var name = employee["name"];
console.log("Name "+name)

console.log("--------------using for in loop-------------")
for (const key in employee) {
    console.log(employee[key])
}
