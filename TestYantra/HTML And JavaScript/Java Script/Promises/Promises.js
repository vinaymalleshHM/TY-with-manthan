// const promise = new Promise(function (resolve, reject) {
//     if (2 > 10) {
//         resolve("Success")
//     }
//     else {
//         reject("Error")
//     }
// })

// promise.then(function (data) {
//     console.log("Data ", data)
// }).catch(function (error) {
//     console.log("Error", error)
// })

const personData = new Promise(function (resolve, reject) {   //api
    if (20 > 10) {
        let data = [10, 20, 40, 50]
        resolve(data)
    }
    else {
        reject("No Data")
    }
})
personData.then(function (data) {
    console.log("Data ", data)
    data = data.push(222,1)
    return data;
}).then(function(planeData){
    console.log("planet data ",planeData)
}).catch(function(error){
    console.log("Error ",error)
})