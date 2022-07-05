#include <iostream>
#include <math.h>

using namespace std;

void menu();
void create1DArray(float *&, int);
void create2DArray(float **&, int);
void delete1DArray(float *&);
void delete2DArray(float **&, int);
void displayMatrix(float **&, float *&, int);
void insertDataToMatrix(float **&, float *&, int);
int getSizeOfMatrix();
void invokeAllFunctions(float **&, float **&, float *&, float *&, int &);
void elimination(float **&, float **&, float *&, float *&, int);

int main()
{
    menu();
    return 0;
}

void menu(){
    int loop = 1;
    float ** arrA = nullptr;
    int n;
    float *arrB = nullptr;
    float ** arrAC = nullptr;
    float *arrBC = nullptr;
    while(loop){
        int wybor;
        cout<<"Wyjscie - 0"<<endl<<"Eliminacja Choleskiego - 1"<<endl;
        cin>>wybor;
        switch(wybor){
            case 0:
                cout<<endl<<"Nastepuje wyjscie z programu..."<<endl;
                loop = 0;
                break;
            case 1:
                invokeAllFunctions(arrA, arrAC, arrB, arrBC, n);
                break;
            default:
                break;
        }
    }
}

void create2DArray(float **&arr, int n){
    arr = new float *[n];
    for(int i = 0; i < n; i++){
        arr[i] = new float[n];
    }
}

void create1DArray(float *&arr, int n){
    arr = new float[n];
}

void delete2DArray(float **&arr, int n){
    for(int i = 0; i < n; i++){
        delete [] arr[i];
    }
    delete [] arr;
}

void delete1DArray(float *&arr){
    delete[] arr;
}

void displayMatrix(float **&arrA, float *&arrB, int n){
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < n; j ++){
            cout << arrA[i][j] << "\t";
        }
        cout << "|\t" << arrB[i] << endl;
    }

}

void insertDataToMatrix(float **&arrA, float *&arrB, int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << "A[" << i << "][" << j << "] = ";
            cin >> arrA[i][j];
            cout << endl;
        }
        cout << "B[" << i << "] = ";
        cin >> arrB[i];
        cout << endl << endl;
    }

}

int getSizeOfMatrix(){
    int n;
    cout << "Wprowadz wielkosc macierzy: ";
    cin >> n;
    cout << endl;
    return n;
}

void invokeAllFunctions(float **&arrA, float **&arrAC, float *&arrB, float *&arrBC, int &n){
    n = getSizeOfMatrix();
    create1DArray(arrB, n);
    create2DArray(arrA, n);
    create1DArray(arrBC, n);
    create2DArray(arrAC, n);
    insertDataToMatrix(arrA, arrB, n);
    displayMatrix(arrA, arrB, n);
    elimination(arrA, arrAC, arrB, arrBC, n);
    cout << endl << endl << "Po eliminacji: " << endl << endl;
    displayMatrix(arrAC, arrB, n);
    delete1DArray(arrB);
    delete2DArray(arrA, n);
    delete1DArray(arrBC);
    delete2DArray(arrAC, n);
}

void elimination(float **&arrA, float **&arrAC, float *&arrB, float *&arrBC, int n){
    for(int s = 0; s < n; s++){
        int sum = 0;
        for(int j = 0; j < s-1; j ++){
            sum += pow(abs(arrAC[s][j]), 2);
        }
        arrAC[s][s] = sqrt(arrA[s][s] - sum);
        sum = 0;
        for(int i = s + 1; i < n; i++){
            int sum2 = 0;
            for(int l = 0; l < s-1; l++){
                sum2 += arrAC[i][l] * arrAC[s][l];
            }
            arrAC[i][s] = (arrA[i][s] - sum2)/arrAC[s][s];
            sum2 = 0;
        }
    }

}
