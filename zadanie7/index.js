$(document).ready(function () {
    $('.slider').slick( {
        dots: true,
        slidesToShow:3,
        slidesToScroll:3,
        speed: 1000,
        responsive:[
            {
                breakpoint:576,
                settings:{
                    slidesToShow:1
                }
            }
            
        ]
    })
   
});