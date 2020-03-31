function validateForm() {

    // let loginForm = document.forms['loginForm']
    // console.log(loginForm)
    let userNameEle = document.forms['loginForm']['user']
    let passwordEle = document.forms['loginForm']['password']
    if (userNameEle.value.length > 5) {
        let pEle = document.getElementById("pele")
        pEle.style.display = "none"
        // return true
    }
    else {
        let pEle = document.getElementById("pele")
        pEle.style.display = "block"
        //return false
    }
    if (passwordEle.value.length > 5) {
        let pEle = document.getElementById("pwd")
        pEle.style.display = "none"
        //return true

    }
    else {
        let pEle = document.getElementById("pwd")
        pEle.style.display = "block"
        //return false
    }
    if (userNameEle.value.trim().length > 5 && passwordEle.value.trim(). length > 5) {
        alert('data Succussfull')
        return true
    }
    else {
        return false
    }

} 