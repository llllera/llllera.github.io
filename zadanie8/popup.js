function click1(event) {
    window.location.href = 'https://llllera.github.io/zadanie9/index1.html';
}



window.addEventListener("DOMContentLoaded", function (event) {
    console.log("DOM fully loaded and parsed")
    let button_popup = document.getElementById("button_open")
    button_popup.addEventListener("click", click1)
})
