#include <iostream>

using namespace std;

int main(){
	
	int n;

	cin >> n;

	for(int i = 0; i < n; i++){
		int f;

		cin >> f;

		int sum = 0;

		for(int j = 0; j < f; j++){
			int size, animals, eco;

			cin >> size >> animals >> eco;

			sum += size * eco;
		}

		cout << sum << endl;


	}

	return 0;
}