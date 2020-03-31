//fetch('https://jsonplaceholder.typicode.com/todos/1')

function getData() {
    fetch('https://jsonplaceholder.typicode.com/todos')
        .then(resp => resp.json())
        .then(json => console.log(json))
        .catch(err => console.log(err))
}