const myForm = document.getElementById("signup_form");

myForm.addEventListener('submit',function(e){
    e.preventDefault(); // prevent reloading of page

    const formData = new FormData(this);
    console.log(formData.get('ExamPaperType'));
    var object = {};
    
    formData.forEach((value, key) => object[key] = value);
    
    var json = JSON.stringify(object);
    console.log(json);


    fetch('http://localhost:9000/signup/submit',{
        method:'POST',
        headers: {
            'Content-Type' : 'application/json'
        },
        body:json,
        mode:'cors'
    })
    .then((response) => {
        console.log(response.status,response.ok);
        return response.text()
    }).then(data => console.log(data))
    .catch((err) => {
        console.error(err);
    })
});