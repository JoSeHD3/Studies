#include <iostream>
#define N 5
using namespace std;

void menu();
void create2DArray(float **&, int);
void create1DArray(float *&, int);
void fillArrays(float **&, float *&, int);
void applyGaussElim(float **&, float *&, int);
void displayResults(float **&, float *&, float *&, int);
void displayMatrix(float **&, float *&, int);
void clearArray(float *&);
void clear2DArray(float **&, int);
void testMatrixOne(float **&, float *&, int);
void testMatrixTwo(float **&, float *&, int);
void testMatrixThree(float **&, float *&, int);

int main(){

    menu();
    return 0;
}

void menu(){
    float **arrA = nullptr;
    int loop = 1;
    float *arrB = nullptr;
    int n;
    float *arrR = nullptr;

    while(loop){
        int macierz;
        cout << "Czy chcesz uzyc jednej z zadeklarowanych macierzy(1), czy chesz zadeklarowac wlasna(2)? Wyjscie(0)" << endl;
        cin >> macierz;

        switch(macierz){
            case 0:
                loop = 0;
                break;
            case 1:
                int test;
                cout <<"Wybierz jedne z danych testowych (1, 2, 3): "<<endl;
                cin >> test;
                switch(test){
                    case 1:
                        n = 3;
                        testMatrixOne(arrA, arrB, n);
                        create1DArray(arrR, n);
                        displayMatrix(arrA, arrB, n);
                        applyGaussElim(arrA, arrB, n);
                        displayResults(arrA, arrB, arrR, n);
                        clear2DArray(arrA, n);
                        clearArray(arrB);
                        clearArray(arrR);
                        break;
                    case 2:
                        n = 4;
                        testMatrixTwo(arrA, arrB, n);
                        create1DArray(arrR, n);
                        displayMatrix(arrA, arrB, n);
                        applyGaussElim(arrA, arrB, n);
                        displayResults(arrA, arrB, arrR, n);
                        clear2DArray(arrA, n);
                        clearArray(arrB);
                        clearArray(arrR);
                        break;
                    case 3:
                        n = 4;
                        testMatrixThree(arrA, arrB, n);
                        create1DArray(arrR, n);
                        displayMatrix(arrA, arrB, n);
                        applyGaussElim(arrA, arrB, n);
                        displayResults(arrA, arrB, arrR, n);
                        clear2DArray(arrA, n);
                        clearArray(arrB);
                        clearArray(arrR);
                        break;
                    default:
                        cout<< endl << "Nie ma danych testowych pod numerem " << test << endl;
                        break;
                }
                break;
            case 2:
                cout << "Wpisz liczbe niewiadomych: ";
                cin >> n;
                create2DArray(arrA, n);
                create1DArray(arrB, n);
                create1DArray(arrR, n);
                fillArrays(arrA, arrB, n);
                displayMatrix(arrA, arrB, n);
                applyGaussElim(arrA, arrB, n);
                displayResults(arrA, arrB, arrR, n);
                clear2DArray(arrA, n);
                clearArray(arrR);
                clearArray(arrB);
                break;
            default:
                break;
        }
    }
}

void create2DArray(float **& arr, int n){
    arr = new float*[n];
    for(int i = 0; i < n; i++)
        arr[i] = new float[n];

}

void create1DArray(float *& arr, int n){
    arr = new float[n];
}

void fillArrays(float **& arrA, float *& arrB, int n){
    cout << "Wprowadz kolejno wartosci niewiadomych: " << endl;

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << "A[" << i << "][" << j << "] = ";
            cin >> arrA[i][j];
            cout << endl;
        }
        cout << "B[" << i << "] = ";
        cin >> arrB[i];
        cout << endl;
    }
}

void applyGaussElim(float **& arrA, float *& arrB, int n){
    float mult;
    for(int i = 0; i < n-1; i ++){
        if(arrA[i][i] == 0.0){
            cout << "Blad danych.";
            break;
        }

        for(int j = i + 1; j < n; j++){
            mult = arrA[j][i]/arrA[i][i];

            for(int k = 0; k <= n; k++){
                arrA[j][k] = arrA[j][k] - (mult * arrA[i][k]);
            }
            arrB[j] = arrB[j] - (mult * arrB[i]);
        }
    }
}

void displayResults(float **& arrA, float *& arrB, float *& arrR, int n){
    cout << endl << "Metoda podstawowa." << endl << endl;


    arrR[n-1] = arrB[n-1]/arrA[n-1][n-1];
    for(int i = n-2; i >= 0; i --){
        arrR[i] = arrB[i];
        for(int j = i + 1; j < n; j++){
            arrR[i] = arrR[i] - arrA[i][j]*arrR[j];
        }
        arrR[i] = arrR[i]/arrA[i][i];
    }

    int sum = 0;
    int spr = 1;
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            sum += arrA[i][j];
        }
        if(sum == 0){
            spr = 0;
            break;
        }
        sum = 0;
    }
    if(spr){
        for(int i = 0; i < n; i ++){
            cout << "X[" << i << "] = " << arrR[i] << endl;
        }
    } else {
        cout << "Rownanie nie ma rozwiazan." << endl;
    }
}

void displayMatrix(float **& arrA, float *& arrB, int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << arrA[i][j] << "\t";
        }
        cout << "|\t" << arrB[i] << endl;
    }
}

void clearArray(float *& arr){
    delete[] arr;
}

void clear2DArray(float **& arr, int n){
    for(int i = 0; i < n; i++){
        delete[] arr[i];
    }
    delete[] arr;
}

void testMatrixOne(float **& arrA, float *& arrB, int n){
    create1DArray(arrB, n);
    create2DArray(arrA, n);
    float arrBs[n] = {9, 13, 40};
    for(int i = 0; i < n; i++){
        arrB[i] = arrBs[i];
    }
    float arrAs[n][n] = {{1, 1, 1}, {2, -3, 4}, {3, 4, 5}};
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < n; j++)
            arrA[i][j] = arrAs[i][j];
    }
}

void testMatrixTwo(float **& arrA, float *& arrB, int n){
    create1DArray(arrB, n);
    create2DArray(arrA, n);
    float arrBs[n] = {0, 4, 0, -1};
    float arrAs[n][n] = {{1, 2, -1, 2}, {1, 0, -2, 4}, {0, -3, 1.5, 7}, {0, -1, 1, 6}};
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < n; j++)
            arrA[i][j] = arrAs[i][j];
    }
    for(int i = 0; i < n; i++){
        arrB[i] = arrBs[i];
    }
}

void testMatrixThree(float **& arrA, float *& arrB, int n){
    create1DArray(arrB, n);
    create2DArray(arrA, n);
    float arrBs[n] = {1, -2, 1.5, -0.5};
    float arrAs[n][n]= {{1, 1, 0, -3}, {1, 4, -1, -4}, {0.5, 0.5, -3, -5.5}, {1.5, 3, -5, -9}};
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < n; j++)
            arrA[i][j] = arrAs[i][j];
    }
    for(int i = 0; i < n; i++){
        arrB[i] = arrBs[i];
    }
}
