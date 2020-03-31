console.log(window)
console.log(this)
console.log(this === window)
var a = 10;
console.log("a = "+a)
console.log("with window ",window.a)
// console.log("without window ",a)
function add(){
    console.log("add method")
}
// alert("this site may contain harmful content ")
// var isAdult = confirm("Are you 23 years old")
// console.log(isAdult)
var age = prompt("Enter Your age",0)
console.log("age = ",age)