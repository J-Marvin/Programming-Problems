// 488 Triangle Wave	

#include<iostream>

using namespace std;

int main(){

	int n, f, a;

	cin >> n;

	for(int i = 0; i < n; i++){
		cin >> a >> f;
		for(int j = 0; j < f; j++){
			for(int k = 1; k <= a; k++){
				for(int l = 0; l < k; l++)
					cout << k;

				cout << endl;
			}

			for(int k = a - 1; k >= 1; k--){
				for(int l = 0; l < k; l++)
					cout << k;

				cout << endl;
			}

			if(!(j == f - 1 && i == n - 1))
				cout << endl;
		}
	}
	return 0;
}