
window.addEventListener('DOMContentLoaded', () => {

    var test1 = document.getElementById("un");
    var test2 = document.getElementById("deux");
    var test3 = document.getElementById("troi");
    var test4 = document.getElementById("quatre");
     
    /*************** recuper les div  */
    
    var div1 = document.getElementById("pageun");
    var div2 = document.getElementById("pagedeux");
    var div3 = document.getElementById("pagetroi");
    var div4 = document.getElementById("pagequatre");
    
    let touteLesDiv = document.getElementsByClassName('page')


    test1.addEventListener('click', function (event) {
        // alert('Element clicked through function!');

        div1.classList.add("hide");
        div2.classList.add("hide");
        div3.classList.add("hide");
        div4.classList.add("hide");
        div1.classList.remove("hide");
    });

    test2.addEventListener('click', function (event) {
        // alert('Element clicked through function!');
      
        div1.classList.add("hide");
        div2.classList.add("hide");
        div3.classList.add("hide");
        div4.classList.add("hide");
        div2.classList.remove("hide");

    });

    test3.addEventListener('click', function (event) {
        // alert('Element clicked through function!');
       
        div1.classList.add("hide");
        div2.classList.add("hide");
        div3.classList.add("hide");
        div4.classList.add("hide");
        div3.classList.remove("hide");
        
    });
    test4.addEventListener('click', function (event) {
        // alert('Element clicked through function!');
        div1.classList.add("hide");
        div2.classList.add("hide");
        div3.classList.add("hide");
        div4.classList.add("hide");
        div4.classList.remove("hide");
        
    });
    });

/**** navigation  */






