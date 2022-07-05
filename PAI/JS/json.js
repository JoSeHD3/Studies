var nr = 0;

function zapiszProdukt(){
    var item = {};
    item.nazwa = document.getElementById("nazwa").value;
    item.cena = document.getElementById("cena").value;
    item.kolor = document.getElementById("kolor").value;
    item.liczba = document.getElementById("liczba").value;
    localStorage.setItem(nr, JSON.stringify(item));
    nr++;
}

function wyswietlKoszyk(){
    tresc = "";
    for(i = 0; i < localStorage.lenght; i++){
        key = localStorage.key(i);
        var retrieveItem = JSON.parse(localStorage.getItem(key));
        tresc += "<p>" + retrieveItem.nazwa + ", " + retrieveItem.cena + ", " + retrieveItem.kolor + ", " + retrieveItem.liczba + "</p>";
        console.log(tresc);
    }

    document.getElementById("dane").innerHTML = tresc;
}

function usunProdukty(){
    localStorage.clear();

    document.getElementById("dane").innerHTML = "";
}