// window.addEventListener('DOMContentLoaded', function(){
//     let name = document.getElementById("forName");
//     let email = document.getElementById("forEmail");
//     name.value = localStorage.getItem('forName');
//     name.addEventListener("change", event => {
//         localStorage.setItem('forName', name.value);
//     });

//     email.value = localStorage.getItem('forEmail');
//     email.addEventListener("change", event => {
//         localStorage.setItem('forEmail', email.value);
//     });
// })
// document.addEventListener('DOMContentLoaded', function(){
//     const form = document.getElementById('form');
//     form.addEventListener('submit', formSend);

    

//     async function formSend(e){

//         e.preventDefault();

//         let error = formValidate(form);

//         let formData =  new FormData(form);

//         if(error===0){
//             form.classList.add('_sending');
//             let responce = await fetch('https://formcarry.com/s/gf9XxUK37', {
//                 method: 'POST',
//                 body: formData
//             })
//             if(responce.ok){
//                 alert('Успешно');
//             }else{
//                 alert('Что-то пошло не так..');
//             }
            
//         }else{
//             alert('Дайте согалсие на обработку данных');
//         }
//     }

//     function formValidate(form){
//         let error = 0;
//         let input = document.getElementById("forAgreement");
//         if(input.getAttribute("type")==="checkbox" && input.checked===false){
//             error++;
//         }
//         return error;
//     }
// })
window.addEventListener("DOMContentLoaded", function () {
    let name = document.getElementById("forName");
    let email = document.getElementById("forEmail");

    name.value = localStorage.getItem('forName');
    name.addEventListener("change", event => {
        localStorage.setItem('forName', name.value);
    });

    email.value = localStorage.getItem('forEmail');
    email.addEventListener("change", event => {
        localStorage.setItem('forEmail', email.value);
    });

    let check = document.getElementById("forAgreement");
    let form = document.getElementById("formm");
    form.addEventListener("submit", event => {
        if (check.checked == true) {
            fetch('https://formcarry.com/s/gf9XxUK37', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json', 'Accept': 'application/json' },
                body: JSON.stringify({
                    formName: name.value,
                    formEmail: email.value,
                })
            })
                .then(response => console.log(response))
                .then((data) => {
                    alert("Success!");
                    localStorage.removeItem('forName');
                    localStorage.removeItem('forEmail');
            
                    name.value = localStorage.getItem('forName');
                    email.value = localStorage.getItem('forEmail');
                  
                })
                .catch((error) => { alert("Error"); });
            event.preventDefault();
        }
        else {
            alert("Дайте свое согласие на отправку");
            event.preventDefault();
        }
    })
});
