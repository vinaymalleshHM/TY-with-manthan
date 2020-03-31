// var ul = document.createElement('ul')

// var li1 = document.createElement("li")
// li1.textContent = "BMW"

// var li2 = document.createElement("li")
// li2.textContent = "Audi"

// var li3 = document.createElement("li")
// li3.textContent = "Porsche"
// ul.appendChild(li1)
// ul.appendChild(li2)
// ul.appendChild(li3)

// document.body.appendChild(ul)

var list = `<ul>

    <li>BMW</li>
    <li>AUDI</li>
    <li>PORSCHE</li>

</ul>`
var divEle = document.getElementById("addHere")
divEle.innerHTML = list
//divEle.textContent = list