// magictrick	

#include<iostream>

using namespace std;

int main(){

	int letters[26];
	bool isPossible = true;

	for(int i = 0; i < 26; i++)
		letters[i] = 0;

	string s;

	cin >> s;

	for(int i = 0; i < s.length() && isPossible; i++){
		letters[s[i] - 'a']++;

		if(letters[s[i] - 'a'] >= 2)
			isPossible = false;
	}

	if(isPossible)
		cout << 1;
	else cout << 0;
	return 0;
}