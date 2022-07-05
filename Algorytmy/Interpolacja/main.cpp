#include <iostream>

using namespace std;

struct Dane{

    float x,y;

};

void menu();
float algorithm(int, Dane [], float);

int main()
{
    menu();
    return 0;
}

void menu(){

    int w;

    cout<<"Podaj liczbe wezlow: ";
    cin>>w;

    Dane arr[w];
    int n = w-1;

    cout<<endl<<"Podaj wartosci x, y dla x(1)"<<endl;
    cin>>arr[0].x;
    cin>>arr[0].y;
    float x, y;
    for(int i = 1; i < w; i++){
        while(true){
            cout<<endl<<"Podaj wartosci x, y dla x("<<i+1<<")"<<endl;
            cin>>x;
            cin>>y;

            if(x > arr[i-1].x) break;
        }
        arr[i].x = x;
        arr[i].y = y;
    }

    float p;
    cout<<endl<<"Podaj punkt p: ";
    cin>>p;

    if(p >= arr[0].x && p <= arr[n].x)
        cout<<"Przyblizona wartosc tej funkcji dla punktu "<<p<<" jest rowna: "<<algorithm(w, arr, p);
    else cout<< "Nie da sie obliczyc przyblizonej wartosci tej funkcji dla punktu "<<p<<", poniewaz znajduje sie ona poza przedzialem.";

}

float algorithm(int w, Dane f[], float p){
    float r = 0;

    for(int i = 0; i < w; i++){
        float temp = f[i].y;
        for(int j = 0; j < w; j++){
            if(j != i){
                temp *= (p - f[j].x)/(f[i].x - f[j].x);
            }
        }
        r += temp;
    }
    return r;
}

