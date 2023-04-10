#include<iostream>
#include<stdlib.h>

using namespace std;

int main(){

	long long int a, b;

	while(cin >> a){
		cin >> b;

		cout << abs(b - a) << endl;
	}
	return 0;
}