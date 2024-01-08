
document.addEventListener('DOMContentLoaded', function(){
    const form = document.getElementById('form');
    form.addEventListener('submit', formSend);

    async function formSend(e){

        e.preventDefault();

        let error = formValidate(form);

        let formData =  new FormData(form);

        if(error===0){
            form.classList.add('_sending');
            let responce = await fetch('https://formcarry.com/s/gf9XxUK37', {
                method: 'POST',
                body: formData
            })
            if(responce.ok){
                alert('Успешно');
            }else{
                alert('Что-то пошло не так..');
            }
            
        }else{
            alert('Дайте согалсие на обработку данных');
        }
    }

    function formValidate(form){
        let error = 0;
        let input = document.getElementById("forAgreement");
        if(input.getAttribute("type")==="checkbox" && input.checked===false){
            error++;
        }
        return error;
    }
})