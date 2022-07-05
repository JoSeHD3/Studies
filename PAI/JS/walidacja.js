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

function sprawdz(){
    var ok = true;

    obiektImie = /^[A-ZŁŚ][a-złśąę]{1,20}(\s[A-ZŁŚ][a-złśąę]{1,20})?$/;
    obiektNazw = /^[A-ZŁŚ][a-złśąę]{1,20}(\-[A-ZŁŚ][a-złśąę]{1,20})?$/;
    obiektMail = /^(([\w_]+)-*\.?)+@[\w](([\w]+)-?_?\.?)+([a-z]{2,4})$/;
    obiektWiek = /^[1-9][0-9]{1,2}$/;

    if(!sprawdzPole("surname", obiektNazw)){
        ok = false;
        document.getElementById("nazw_error").innerHTML = "Wpisz poprawne nazwisko!";
    } else document.getElementById("nazw_error").innerHTML = "";

    if(!sprawdzPole("name", obiektImie)){
        ok = false;
        document.getElementById("im_error").innerHTML = "Wpisz poprawne imię!";
    } else document.getElementById("im_error").innerHTML = "";

    if(!sprawdzPole("age", obiektWiek)){
        ok = false;
        document.getElementById("wiek_error").innerHTML = "Wpisz poprawny wiek!";
    } else document.getElementById("wiek_error").innerHTML = "";

    if(!sprawdzPole("mail", obiektMail)){
        ok = false;
        document.getElementById("mail_error").innerHTML = "Wpisz poprawny e-mail!";
    } else document.getElementById("mail_error").innerHTML = "";

    if(!sprawdzRadio("przegladarka")){
        ok = false;
        document.getElementById("zaplata_error").innerHTML = "Wybierz metodę zapłaty!";
    } else document.getElementById("zaplata_error").innerHTML = "";

    if(!sprawdzBox("cb1")){
        ok = false;
        document.getElementById("produkt_error").innerHTML = "Wybierz przynajmniej jeden z produktów!";
    } else document.getElementById("produkt_error").innerHTML = "";

    if(ok){
        alert("Imie: " + document.getElementById("name").value + "\n" +
            "Nazwisko: " + document.getElementById("surname").value + "\n" +
            "Wiek: " + document.getElementById("age").value + "\n" +
            "Państwo: " + document.getElementById("country").value + "\n" + 
            "Mail: " + document.getElementById("mail").value + "\n" +
            "Wybrane produkty: " + getValues("cb1") + "\n" + 
            "Wybrana metoda płatności: " + getValues("przegladarka"));
    }

    return ok;
}