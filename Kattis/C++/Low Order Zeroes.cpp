#include <iostream>
#include <vector>

using namespace std;

int main() {
	
	int memo[ 1000001];
	int x;
	
	for(int i = 0; i <= 1e6; i++){
		if(i == 0 || i == 1)
			memo[i] = 1;
		else {
			cout << "test "<< i << endl;
			memo[i] = i * memo[i - 1];
			
			while(memo[i] % 10 == 0)
				memo[i] /= 10;
			
			memo[i] %= 10;
		}
	}
	
	do{
		cin >> x;
		cout << memo[x] << endl;
	} while(x != 0);
	
	return 0;
}
