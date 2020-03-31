var pElement = document.getElementById("demo");
console.log(pElement)
var text = pElement.textContent;
console.log("Text of p ", text)
pElement.textContent = "Good Evening"
var modifier = pElement.textContent;
console.log("Modified Text ", modifier)
var pElement = document.querySelector("p");
pElement.textContent = "Dimple "
console.log(pElement.textContent)


// var elements = document.getElementsByClassName("test")
// console.log("Elemnts", elements)
// elements[0].style.color = "cyan"
// elements[0].style.fontSize = "40px"
// elements[2].style.color = "lime"


// var qElement = document.querySelectorAll(".test")
// qElement[1].style.color = "blue"
// qElement[1].style.fontSize = "50px"

// var bElement = document.createElement("button")
// bElement.textContent = "Click Me!!! "
//     //console.log(bElement)
// document.body.appendChild(bElement)



// var p = document.createElement("p")
// p.textContent = "I am Lost Child"
// document.body.appendChild(p)
// document.write("Goooooooooogle")

// var ele = document.getElementById("add")
// ele.className = "xyz abc"