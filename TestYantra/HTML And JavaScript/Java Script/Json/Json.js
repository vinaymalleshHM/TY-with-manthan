const person = {
    name : 'sundari',
    age  :33,
    hobbies :["Music","Singing"]
}

const JSONObject = JSON.stringify(person)
console.log("JSON Object ",JSONObject)
const JSObject =JSON.parse(JSONObject)
console.log("JS Object ",JSObject)