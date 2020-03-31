console.log("Named Function")
add(5,6)
function add(num1,num2){
    var sum = num1+num2
    console.log("Sum:"+sum)
}

console.log("Ananymous Function")
var multiply=function(n,n1){
    var product=n*n1
    console.log("product "+product)
}
multiply(5,5)
console.log("Self Invoked Function");
(function(s){
    var square = s*s;
    console.log("square "+square)
})(10)
console.log("Arrow Function")

var division = (val1,val2)=>{
    var div = val1/val2
    console.log("Div is "+div)
}
division(10,2)

var sum = (i,j)=>i+j
var value = sum(10,20)
console.log("Value is "+value)

console.log("")