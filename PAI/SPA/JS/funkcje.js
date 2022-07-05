function pokaz(id){
    var tresc="";
    switch(id){
        case 2: 
            tresc += pokazGalerie();
            break;
        case 3:
            tresc += pokazPost();
            break;
        case 4:
            tresc += pokazKontakt();
            break;
        default:
            tresc += pokazO();
    }
    //pobierz element o wskazanym id i ustaw jego nową zawartość
    document.getElementById('blok').innerHTML = tresc;
}

function pokazO(){
    var tresc = '<h2><br />Pierwsze kroki</h2> ';
    //operator += uzupełnia łańcuch kolejną porcją znaków:
    tresc += '<p> W aplikacjach typu SPA ......</p>' + 
             '<p class = "srodek"><img src="images/baner.jpg" alt="Zdjęcie" /></p>'+
             '<article><h2>Wady SPA</h2><p>'+
             'Czas wytworzenia oraz nakład pracy ...</p></arcitle>';
    //przekaż wynik - gotową zawartoćś - do miejsca wywołanai funkcji:
    return tresc;
}
function pokazGalerie(){
    var tresc = '<h2><br />Moja galeria</h2>';
    tresc += '  <div class = "galeria">';
    //wygeneruj kod HTML z obrazami za pomocą pętli for:
    for(i=1;i<=10;i++){
        tresc +='<div class="slajd"> <img src="images/miniaturki/obraz' + i + '.JPG" alt ="Miniaturka" /></div>';
    }
    return tresc += '</div>';
}

function pokazKontakt(){
    var tresc = '<h2><br />Kontakt</h2>';
    //uzupełnij treść:

    tresc += '<h2><br />Dane kontaktowe</h2>' +
             '<section><p>Telefon: +48 123456789 </p>' +
             '<p>Adres e-mail: kontakt@gmail.com</p>'+
             '<p>Adres: Adresowa 123, Lublin</p></section>';
    return tresc;
}

function pokazPost(){
    //funcka generuje kod formularza- dane wpisane w odpowiednie pola przez
    //użytkownika zostaną przekazane mailem na wskazany adres, ale najpeirw po
    //zajsciu zdarzenia submit (wyślij) - zostanie wywołana funkcja pokazDane()
    tresc='<h2><br />Dodaj post</h2>';
    tresc+='<article class="srodek"><form action="mailto:95369@pollub.edu.pl" method="post" onsubmit="return pokazDane();">'+
           'Twoj email:<br /> <input type="email" name="email" id="email" required /><br />'+
           'Pseudonim:<br /> <input type="text" name="nickname" id="nickname" required /><br />'+
           'Państwo:<br /> <select name="country" required>'+
                    '<option value="pl">Polska</option>'+
                    '<option value="de">Niemcy</option>'+
                    '<option value="gb">Anglia</option>'+
                    '<option value="fr">Francja</option></select></br>'+
           'Telefon:<br /><input type="number" name="phone" id ="phone" required /><br />' +
           '<br /><br />Zainteresowania: <br />' + 
           '<input type="checkbox" name="cb" id="cb" value="Sport" /> Sport' +
           '<input type="checkbox" name="cb" id="cb" value="Muzyka" /> Muzyka' +
           '<input type="checkbox" name="cb" value="Film" id="cb" /> Film' +
           '<input type="checkbox" name="cb" value="Inne" id="cb" /> Inne' +
           '<br /><br />Wiek <br />' +
           '<input type="radio" name="wiek" value="<10" id="wiek" required /> Mniej niż 10' +
           '<input type="radio" name="wiek" value="10-20" id="wiek"/> 10-20' +
           '<input type="radio" name="wiek" value="21-30" id="wiek"/> 21-30' +
           '<input type="radio" name="wiek" value="31-40" id="wiek"/> 31-40' +
           '<input type="radio" name="wiek" value="41-50" id="wiek"/> 41-50' +
           '<input type="radio" name="wiek" value=">50" id="wiek"/> Więcej niż 50' +
           '<br /><br />Komentarz: <br /><textarea rows="3" cols="20" id="wiadomosc" name="wiadomosc" required></textarea>'+
           '<br /><input type="submit" name="wyslij" value="Wyślij" />'+
           '</form></article>';
    return tresc;
}

function pokazDane(){
    //Funkcja zbiera dane wpisane w pola formularza i wyświtla okienko
    //typu confirm do zatwierdzenia przez użytkownika:
    var dane="Następujące dane zostana wysłane:\n";
    dane += "Email: " + document.getElementById('email').value + "\n" +
            "Pseudonim: " + document.getElementById('nickname').value + "\n" +
            "Komentarz: " + document.getElementById('wiadomosc').value + "\n" +
            "Telefon: " + document.getElementById('phone').value + "\n" +
            "Zainteresowania: " + sprawdzCB() + "\n" +
            "Wiek: " + sprawdz() + "\n";
    if(window.confirm(dane)) return true;
    else return false;
}

function sprawdz()
{ var tab=document.getElementsByName('wiek');
 var wybrany="";
 for (i=0;i<tab.length;i++)
 { if (tab[i].checked) { wybrany= tab[i].value; break; } }
 if (wybrany === "") {
 tab[0].focus(); return false;
 }
 else { 
 return wybrany;
 }
}

function sprawdzCB()
{ var tab=document.getElementsByName('cb');
 var wybrany="";
 for (i=0;i<tab.length;i++)
 { if (tab[i].checked) { wybrany+= tab[i].value + ", ";} }
 return wybrany;
}