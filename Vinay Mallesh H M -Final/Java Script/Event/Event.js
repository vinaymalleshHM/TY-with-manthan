let pEle = document.createElement("p")
function greet(message) {
    let name = "Bill Gates"
    //alert(message+" "+name)
    alert(`${message} ${name}`)//String interpolation
    console.log(`${2 + 2}`)
    console.log("2+2")
}

function changeFont() {
    let element = document.getElementById("test")
    element.style.fontSize = "50px"
}

function changeFontToOld() {
    let cElement = document.getElementById("test")
    cElement.style.fontSize = "20px"
}

function showData() {
    console.log("Key Pressed and released")
}

function showElement() {
    pEle.textContent = "Create Element "
    document.body.appendChild(pEle)
}
let el = document.getElementById("tes")
// el.onclick = function(){
//     alert("clicked")
// }
 el.addEventListener('click',function(){ //don't use on to use event
     alert("clickkkeeed")

 })