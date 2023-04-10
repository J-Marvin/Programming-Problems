// DiceCup	

#include<iostream>

using namespace std;

int main(){

	bool replace[3][26];

	for(int i = 0; i < 3; i++)
		for(int j = 0; j < 26; j++)
			replace[i][j] = false;

	string s;

	cin >> s;

	int count = 0;

	for(int i = 0; i < s.length(); i++)
		if(i % 3 == 0 && s[i] != 'P'){
			replace[i % 3][s[i] - 'A'] = true;
			count++;
		} else if(i % 3 == 1 && s[i] != 'E'){
			replace[i % 3][s[i] - 'A'] = true;
			count++;
		} else if(i % 3 == 2 && s[i] != 'R'){
			replace[i % 3][s[i] - 'A'] = true;
			count++;
		}
	cout << count;
	return 0;
}