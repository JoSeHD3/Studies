function zapiszPare(){
    kod = document.getElementById("kod").value;
    nazwa = document.getElementById("nazwa").value;

    sessionStorage.setItem(kod, nazwa);
}

function pokazWszystkiePary(){
    tresc = "";
    for(i=0; i < sessionStorage.length; i++){
        key = sessionStorage.key(i);
        value = sessionStorage.getItem(key);
        tresc += "<p style=\"background:#" + key +"\"> "+ value + ", kod koloru: " + key + "</p>";
    }

    document.getElementById("dane").innerHTML = tresc;
}

function usunDane(){
    //for(i = 0; i <= sessionStorage.length; i++)
     //   sessionStorage.removeItem(sessionStorage.key(i));
    sessionStorage.clear();
    document.getElementById("dane").innerHTML = "";
}