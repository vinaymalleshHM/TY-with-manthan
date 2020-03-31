// var brands = ["Kinley","bisleri","kingfisher","babaji"]

// brands.forEach(function(value,index){
//     console.log("Brands = ",value," and Index = ",index)
// }
// )

// var hobbies = ["catching","sleeping","jumping","Numismatics"]

// console.log("Modified length = ",hobbies.push("music"))
// console.log("After push",hobbies)
// console.log("*************/////////////////****************")

// console.log("Removed Element = ",hobbies.pop())
// console.log("After pop",hobbies)
// console.log("*************/////////////////****************")

// console.log("Removed 1st Element = ",hobbies.shift())
// console.log("After shift",hobbies)
// console.log("*************/////////////////****************")

// console.log("Modified length = ",hobbies.unshift("Dancing"))
// console.log("After shift",hobbies)
// console.log("*************/////////////////****************")

// console.log("index of jumping = ",hobbies.indexOf("jumping"))
// console.log("*************/////////////////****************")

// console.log("index of jumping = ",hobbies.indexOf("jumping",2))
// console.log("*************/////////////////****************")

// console.log("index of jumping = ",hobbies.join("/"))
// console.log("*************/////////////////****************")

// console.log("Splice = ",hobbies.splice(1))//returns removed element
// console.log("*************/////////////////****************")

// console.log("Splice = ",hobbies.splice(0,1))//returns removed element
// console.log("*************/////////////////****************")

// console.log("Splice = ",hobbies.splice(1,1,"Singing","Walking"))//returns removed element
// console.log("*************/////////////////****************")

// console.log("Splice = ",hobbies.slice(0))//returns new Array element
// console.log("*************/////////////////****************")

// console.log("Splice = ",hobbies.slice(0,2))//returns new Array element
// console.log("*************/////////////////****************")


 var number = [100,200,300]
var filteredNumber =  number.filter(function(value,index){
    if (value>100) {
        return true
    }
    else{
        return false
    }
}) 
console.log("Filtered Number "+filteredNumber)
console.log("*************/////////////////****************")

var filteredUsingArrow =  number.filter(num=> num>100)
console.log("Filtering using Arrow ",filteredUsingArrow)
console.log("*************/////////////////****************")

var mapNumber =  number.map(function(value,index){
    var val = value+50;
    return val;
})
console.log("Using map",mapNumber)

var mapUsingArrow =  number.map(num=> num+100)
console.log("Map using Arrow ",mapUsingArrow)


var items = [{
    name:"lipstick",
    id:1,
    price:499
},

{
    name:"eyeliner",
    id:2,
    price:999
},{
    name:"watch",
    id:3,
    price:10000
},
{
    name:"trimmer",
    id:1,
    price:1500
}
]

// var filterprice = items.filter(item=> item.price>500)
// console.log("Filtering using Arrow ",filterprice)

// var mapprice = items.map(item=>{ item.price = item.price+100 
// return item
// })
// console.log("map using Arrow ",mapprice)


var mapItem = items.map(item =>{
    var i = {
        name:item.name,
        id:item.id,
        price:item.price+100

}
return i})
console.log("map using Arrow ",mapItem)

var chacolate = ["dairy milk","Dark chacolate","Feraro"] 
var hasKaccha = chacolate.includes("Kaccha mango bite")
console.log("Has Kaccha",hasKaccha)
console.log("--------------------------------")

var isArrayChoc = Array.isArray(chacolate)
console.log("chacolate is array = "+isArrayChoc)
console.log("*******************************")