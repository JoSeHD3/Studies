#include <iostream>
#include <math.h>

using namespace std;

struct Dane{
    float x,y;
};

void menu();
void zmienDane(Dane [], int, int);
void oblicz(Dane [], float, int, int);

int main()
{
    menu();
    return 0;
}

void menu(){

    int w;
    int typ;

    cout<<"Podaj liczbe wezlow: ";
    cin>>w;

    Dane arr[w];

    cout<<endl<<"Podaj wartosci x, y dla x(1)"<<endl;
    cin>>arr[0].x;
    cin>>arr[0].y;
    float x, y;
    for(int i = 1; i < w; i++){
    //    while(true){
            cout<<endl<<"Podaj wartosci x, y dla x("<<i+1<<")"<<endl;
            cin>>x;
            cin>>y;

      //      if(x > arr[i-1].x) break;
    //    }
        arr[i].x = x;
        arr[i].y = y;
    }

    float n = w - 1;

    cout<<endl<<"Wybierz typ: 1 - f(x), 2 - f(1/x), 3 - f(sqrt(x))"<<endl;
    cin>>typ;

    zmienDane(arr, typ, w);
    oblicz(arr, n, w, typ);


}

void zmienDane(Dane dane[], int typ, int w){

    switch(typ){
        case 2:
            for(int i = 0; i < w; i++){
                dane[i].x = 1/dane[i].x;
            }
            break;
        case 3:
            for(int i = 0; i < w; i++){
                dane[i].x = (float) sqrt(dane[i].x);
            }
        default:
            break;
    }

}

void oblicz(Dane dane[], float n, int w, int typ){

    float x = 0, y = 0, x2 = 0, yx = 0, wyz = 0, a0, a1;
    string t;

    for(int i = 0; i < w; i++){
        x += dane[i].x;
        y += dane[i].y;
        x2 += dane[i].x * dane[i].x;
        yx += dane[i].x * dane[i].y;
    }
    wyz = ((n+1) * x2) - (x * x);
    a0 = (y * x2) - (yx * x);
    a1 = ((n+1) * yx) - (x * y);

    switch(typ){
        case 1:
            t = "x";
            break;
        case 2:
            t = "1/x";
            break;
        case 3:
            t = "sqrt(x)";
            break;
        default:
            break;
    }

    cout<<endl<<"Funkcja: "<<"f(" << t << ") = " << a0 << "/" << wyz << " + " << a1 << "/" << wyz << t;
    cout<<endl<<"Funckja: "<<"f(" << t << ") = " << a0/wyz << " + " << a1/wyz << t;
}
