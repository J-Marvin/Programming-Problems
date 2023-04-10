// Parking	

#include<iostream>

using namespace std;

int main(){
	int time[101];

	for(int i = 0; i <= 100; i++)
		time[i] = 0;

	int a, b, c;

	int trucks[3][2];

	cin >> a >> b >> c;

	cin >> trucks[0][0] >> trucks[0][1];
	cin >> trucks[1][0] >> trucks[1][1];
	cin >> trucks[2][0] >> trucks[2][1];

	for(int i = 0; i < 3; i++){
		for(int j = trucks[i][0]; j < trucks[i][1]; j++)
			time[j]++;
	}

	int sum = 0;

	for(int i = 0; i < 101; i++){
		switch(time[i]){
			case 1: sum+=a;break;
			case 2: sum+=b * 2;break;
			case 3: sum+=c * 3;break;
		}
	}

	cout << sum;
	return 0;
}