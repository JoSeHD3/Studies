#include <iostream>

using namespace std;

struct Dane{
    float x;
    float y;

};

void menu();
float algorithm(int, Dane [], float);

int main(){

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

    cout<<endl<<"Wartosc: "<<algorithm(w, arr, p);

}

float algorithm(int w, Dane arr[], float p){                    //COS NIE DZIALA

    float wynikowe[w][w];

    for(int j = 0; j < w; j++){
        wynikowe[j][0] = arr[j].y;
    }

    for(int j = 1; j < w; j++){
        for(int i = 0; 0 < w - j; i++){
            wynikowe[i][j] = (((p-arr[i].x) * wynikowe[i+1][j-1]) - ((p-arr[i+j].x) * wynikowe[i][j-1]))/(arr[i+j].x - arr[i].x);
        }
    }
    cout << endl;
    for(int i = 0; i < w; i++){
        for(int j = 0; j < w; j ++){
            cout<< wynikowe[i][j]<<"\t";
        }
        cout<<endl;
    }

    return wynikowe[w][w];
}
