#include <iostream>

using namespace std;

void menu();
void bisekcja(float, float, double);
void newton(float, double);

int main()
{
    menu();
    return 0;
}

void menu(){
    int metoda;
    int loop = 1;
    double eps;
    while(loop){
        cout<<"Podaj metode: \n1. Bisekcja\n2. Newton\n3. Wyjscie z programu";
        cin >> metoda;
        cout<<"f(x) = x^3 - 71";
        cout << endl << "Podaj dokladnosc: ";
        cin >> eps;
        cout << endl;
        switch(metoda){
            case 1:
                bisekcja(4, 5, eps);
                break;
            case 2:
                newton(4, eps);
                break;
            case 3:
                loop = 0;
                break;
            default:
                break;
        }
    }
}

void bisekcja(float a, float b, double eps){
    int loop = 1, i = 0;
    float s;
    float funcA = a *a * a - 71;
    float funcB = b * b * b - 71;
    float funcS;
    if(funcA * funcB < 0){
        while(loop){
            s =(a+b)/2;
            funcS = s*s*s - 71;
            if(funcA * funcS < 0){
                b = s;
                funcB = funcS;
            } else {
                a = s;
                funcA = funcS;
            }
            i++;
            if(abs(funcS) < eps) break;
        }

    }
    cout << "Przyblizona wartosc pierwiastka dla algorytmu bisekcji to: " << s << endl;
    cout << "Wartosc funkcji w tym punkcie to: " << funcS << endl;
    cout << "Liczba krokow: " << i << endl;
}

void newton(float x, double eps){
    int loop = 1, i = 0;
    float funcX;
    float pochX;
    while(loop){
        funcX = x*x*x - 71;
        pochX = 3 * x * x;
        x = x - (funcX/pochX);
        i ++;
        if(abs(funcX) < eps) break;
    }

    cout << "Przyblizona wartosc pierwiastka dla algorytmu Newtona to: " << x << endl;
    cout << "Wartosc funkcji w tym punkcie to: " << funcX << endl;
    cout << "Liczba krokow: " << i << endl;
}
