function outer() {
    let a = 10;
    function inner() {
        console.log("a is " + a)
    }
    //inner()
    return inner
}
let innerFunc = outer()
innerFunc()