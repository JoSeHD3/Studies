function zlozZamowienie(){
    var ok = true;
    obiektImie = /^[A-ZŁŚ][a-złśąę]{1,20}(\s[A-ZŁŚ][a-złśąę]{1,20})?$/;
    obiektMail = /^(([\w_]+)-*\.?)+@[\w](([\w]+)-?_?\.?)+([a-z]{2,4})$/;

    if(!sprawdzPole("imie", obiektImie)){
        ok = false;
        document.getElementById("imie_error").innerHTML = "Wpisz poprawne imię!";
    } else document.getElementById("imie_error").innerHTML = "";

    if(!sprawdzPole("email", obiektMail)){
        ok = false;
        document.getElementById("mail_error").innerHTML = "Wpisz poprawny e-mail!";
    } else document.getElementById("mail_error").innerHTML = "";

    if(!sprawdzBox("dodatek")){
        ok = false;
        document.getElementById("dodatek_error").innerHTML = "Wybierz przynajmniej jeden z produktów!";
    } else document.getElementById("dodatek_error").innerHTML = "";

    if(!sprawdzBox("sos")){
        ok = false;
        document.getElementById("sos_error").innerHTML = "Wybierz przynajmniej jeden z produktów!";
    } else document.getElementById("sos_error").innerHTML = "";

    if(!sprawdzRadio("ciasto")){
        ok = false;
        document.getElementById("ciasto_error").innerHTML = "Wybierz grubość ciasta!";
    } else document.getElementById("ciasto_error").innerHTML = "";

    if(ok) zapiszProdukt();

    return ok;
}

function anulujZamowienie(){
    localStorage.clear();

    document.getElementById("data").innerHTML = "";
}

function sprawdzPole(pole_id, obiektRegex){
    var obiektPole = document.getElementById(pole_id);
    if(!obiektRegex.test(obiektPole.value))return(false);
    else return (true);
}

function sprawdzRadio(nazwa_radio){
    var obiekt = document.getElementsByName(nazwa_radio);
    for(i = 0; i < obiekt.length; i++){
        wybrany = obiekt[i].checked;
        if (wybrany) return true;
    }
    return false;
}

function sprawdzBox(box_id){
    var obiekt = document.getElementsByName(box_id);
    for(i = 0; i < obiekt.length; i++){
        wybrany = obiekt[i].checked;
        if (wybrany) return true;
    }
    return false;
}

function getValues(name){
    var obiekt = document.getElementsByName(name);
    var s = "";
    for(i = 0; i < obiekt.length; i++){
        wybrany = obiekt[i];
        if(wybrany.checked) s += wybrany.value + " ";
    }
    return s;
}

function zapiszProdukt(){
    var item = {};
    item.nazwa = "Pizza";
    item.ciasto = getValues("ciasto");
    item.dodatek = getValues("dodatek");
    item.sos = getValues("sos");
    item.imie = document.getElementById("imie").value;
    item.email = document.getElementById("email").value;
    item.adres = document.getElementById("adres").value;
    localStorage.setItem(0, JSON.stringify(item));

    wyswietlKoszyk();
}

function wyswietlKoszyk(){
    tresc = "";
    key = localStorage.key(0);
    var retrieveItem = JSON.parse(localStorage.getItem(key));
    tresc += retrieveItem.nazwa + "<p>Ciasto:" + retrieveItem.ciasto + "<br />Dodatki: " + retrieveItem.dodatek + "<br />Sos: " + retrieveItem.sos + 
    "<br />Imie odbiorcy: " + retrieveItem.imie + "<br />e-mail odbiorcy: " + retrieveItem.email + "<br />Adres: " + retrieveItem.adres + "</p>";
    
    document.getElementById("data").innerHTML = tresc;

}