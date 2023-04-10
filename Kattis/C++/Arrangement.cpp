#include <iostream>
#include <cmath>


using namespace std;

int main(){

	int n, m;

	cin >> n >> m;

	int upperLimit = ceil(m * 1.0 / n);
	int lowerLimit = m * 1.0 / n;

	for(int i = 0; i < n && m > 0; i++){
		if(m % upperLimit > 0){
			m-= lowerLimit;

			for(int j = 0; j < lowerLimit; j++){
				cout << '*';
			}

			cout << endl; 
		} else {
			m -= upperLimit;

			for(int k = 0; k < upperLimit; k++){
				cout << '*';
			}

			cout << endl;
		}


	}

	return 0;
}