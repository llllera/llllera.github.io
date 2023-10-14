function click1() {
    event.preventDefault();
    let f1 = document.getElementById("input").value
    let s = document.getElementsByName("select1")
    let r = document.getElementById("result")
    let m = f1.match(/^[0-9]+$/)
    if (m !== null && f1 > 0){
        r.innerHTML = Number(f1) * Number(s[0].value)
    }
    else{
        alert("Неправильно введено значение");
    }
    return false
}
  window.addEventListener('DOMContentLoaded', function (event) {
    console.log("DOM fully loaded and parsed");
    let b = document.getElementById("button1");
    b.addEventListener("click", click1);
  });