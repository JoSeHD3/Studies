#include <iostream>

using namespace std;

struct Dane{

    float x,y;

};

void menu();
void obliczWartosci(int, int, float, float, Dane [], float);
float metodaTrapezow(Dane [], int, float);
float metodaSimpsona(Dane [], int, float);

int main()
{
    //cout<<"test";
    menu();
    return 0;
}

void menu(){

    int n, rodzaj;
    float a, b, h;

    cout<<"Podaj n: ";
    cin>>n;

    Dane arr[n+1];

    cout<<endl<<"Podaj a: ";
    cin>>a;
    cout<<endl<<"Podaj b: ";
    cin>>b;

    h = (b - a) / n;

    cout<<endl<<"Podaj rodzaj calki: \n1 - 1/(x^2+1)\n2 - 1/x\n3 - 1/(1+x)";
    cin>>rodzaj;
    obliczWartosci(n, rodzaj, a, b, arr, h);
    cout<<endl<<endl;
    cout<<"Wynik Metoda Trapezow: " << metodaTrapezow(arr, n, h) << endl;
    if(n%2 == 0){
        cout<<"Wynik Metoda Simpsona: " << metodaSimpsona(arr, n, h) << endl;
    } else {
        cout<< "Nie mozna bylo podac wyniku metoda simpsona, poniewaz n nie jest parzyste.";
    }

}

void obliczWartosci(int n, int rodzaj, float a, float b, Dane f[], float h){
   // h = (b - a) / n;
    f[0].x = a;
    for(int i = 1; i <= n; i++)
        f[i].x = f[i-1].x + h;

    switch(rodzaj){
        case 1:
            for(int i = 0; i <= n; i++)
                f[i].y = 1.0/((f[i].x * f[i].x) + 1);
            break;
        case 2:
            for(int i = 0; i <= n; i++)
                f[i].y = 1.0/f[i].x;
            break;
        case 3:
            for(int i = 0; i <= n; i++)
                f[i].y = 1.0/(1+f[i].x);
            break;
        default:
            break;
    }
}

float metodaTrapezow(Dane f[], int n, float h){
    float res;
    float srodek;
    for(int i = 1; i < n; i ++)
        srodek += f[i].y;
    res = h * (1.0/2.0 * f[0].y + srodek + 1.0/2.0 * f[n].y);

    return res;
}

float metodaSimpsona(Dane f[], int n, float h){
    float res, even, odd;
    for(int i = 1; i <= n - 1; i += 2)
        odd += 4 * f[i].y;
    for(int j = 2; j <= n - 2; j += 2)
        even += 2 * f[j].y;
    res = (h/3.0) * (f[0].y + odd + even + f[n].y);


    return res;
}
