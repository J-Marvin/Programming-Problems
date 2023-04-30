#include <iostream>
#include <unordered_map>

using namespace std;

bool canConstruct (string ransomNote, string magazine) {
	unordered_map<char, int> letters;

	for(int i = 0; i < magazine.length(); i++) {
		if (letters.find(magazine[i]) == letters.end()) {
			letters[magazine[i]] = 1;
		} else {
			letters[magazine[i]] += 1;
		}
	} 

	for(int i = 0; i < ransomNote.length(); i++) {
		if (letters.find(ransomNote[i]) == letters.end())
			return false;
		else if(letters[ransomNote[i]] <= 0)
			return false;
		else {
			letters[ransomNote[i]] --;
		}
	}

	return true;
}

int main() {
	string a, b;
	cin >> a >> b;

	cout << canConstruct(a, b);
	return 0;
}