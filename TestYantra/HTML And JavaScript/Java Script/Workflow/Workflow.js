// function first(){
//     setTimeout(function(){
//         console.log("first function executed")
//     },5000)
//     console.log("Hello Good Morning ")
// }
// console.log("OutSide Function ")
// function second(){
//     console.log("second function executed")
// }
// first()
// second()
// console.log("*********************************")
// console.log("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^")
function first(callback){
    setTimeout(function(){
        console.log("first function executed")
        callback()
    },0)
    console.log("Hello Good Morning ")
}
function second(){
    console.log("second function executed")
}
first(second)
