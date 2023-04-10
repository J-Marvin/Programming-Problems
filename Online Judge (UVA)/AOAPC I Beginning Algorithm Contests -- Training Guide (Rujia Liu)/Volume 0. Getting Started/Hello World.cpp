#include <iostream>

using namespace std;

int main(){
	int memo[16];
	int n = 0;
	int c = 1;

	for(int i = 0; i < 16; i++){
		if(i == 0)
			memo[i] = 1;
		else{
			memo[i] = 2 * memo[i - 1];
		}
	}

	cin >> n;

	while (n >= 0){
		int ctr = 0;
		for(int i = 0; i < 16; i++){
			if(memo[i] < n)
				continue;
			else{
				ctr = i;
				break;
			}
		}

		cout << "Case " << c++ << ": " << ctr << endl;

		cin >> n;
	};
	return 0;
}