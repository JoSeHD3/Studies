function oblicz(){
    var l1=document.getElementById('l1');
    l1 = l1.value;
    l1 = parseInt(l1);

    var l2 = parseInt(document.getElementById('l2').value);

    var s = document.getElementById('suma');
    s.value = l1+l2;
}

function rata(){
    var k = parseInt(document.getElementById('k').value);
    var r = document.getElementById('rata');
    var pr = parseInt(document.getElementById('pr').value);
    var n = parseInt(document.getElementById('n').value);
    var pr_mc = pr/12;

    r.value = (k*pr_mc)/(1-(1/Math.pow(1+pr_mc,n)));
    if(isNaN(r.value) || !isFinite(r.value)){
        r.value = "Błąd";
    }
}