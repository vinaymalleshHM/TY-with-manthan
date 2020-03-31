var date = new Date;
console.log("Today Date ",date);

// var date1 = new Date(0);
// console.log("Date millisecond constructor ",date1)
// var date2 = new Date("October 30")
// console.log("Date String Constructor ",date2)
// var date3 = new Date(1990,4,12)
// console.log("Date year month "+date3)
console.log("========================================")
var year = date.getFullYear()
console.log("year:"+year)
var minute = date.getMinutes()
console.log("minute:"+minute)
var month = date.getMonth()
console.log("month:"+month)
var day = date.getDay()
console.log("day:"+day)
var todaydate = date.getDate()
console.log("todaydate:"+todaydate)


var months = ["jan","feb","mar","apl","may","july","July","August","Sept","Oct","Nov","Dec"]
var thisMonth = months[month]

var days = ["Sun","Mon","Tue","Wed","Thur","Fri","Sat"]
var thisDay = days[day]

console.log("******************************************")
console.log("Month :"+thisMonth)
console.log("Day :"+thisDay)


var random = Math.ceil(Math.random()*100)
console.log("Random Number btw 1 to 100 "+random)

console.log("************************")
var str = "10"
var num = 10 
if (str==num) {
    console.log("Equal")
}
else
{
    console.log("Not Equal")
}
console.log("************************")
if (str===num) {
    console.log("Equal")
}
else
{
    console.log("Not Equal")
}
console.log("************************")
var age = 12;
var voting =age>18 ? "Eligible" : "Not Eligible"
console.log(voting)