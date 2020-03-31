// let b = 'hgfhgfh'

// function outer() {
//     let a = 10;

//     function inner() {
//         console.log("a is " + a)
//     }
//     //inner()

//     console.log("veju")
//     return inner
// }
// let innerFunc = outer()
// innerFunc()
// console.log(b)


let a = 'hellow world';

function first() {
    console.log('inside first  function');
    second();
}

function second() {
    console.log('inside second  function');

}
first();
console.log('inside global')