// https://leetcode.com/problems/roman-to-integer/description/

#include <iostream>
#include <unordered_map>

using namespace std;

int main() {

	unordered_map<char, int> map;
	int total = 0;

	map['I'] = 1;
	map['V'] = 5;
	map['X'] = 10;
	map['L'] = 50;
	map['C'] = 100;
	map['D'] = 500;
	map['M'] = 1000;


	string s;

	cin >> s;

	for(int i = 0; i < s.length(); i++) {
		if (i + 1 < s.length()) {
			switch(s[i]) {
				case 'I':
					if (s[i + 1] == 'V') {
						i++;
						total += 4;
					} else if (s[i + 1] == 'X') {
						i++;
						total += 9;
					} else {
						total += 1;
					}
					break;
				case 'X':
					if (s[i + 1] == 'L') {
						i++;
						total += 40;
					} else if (s[i + 1] == 'C') {
						i++;
						total += 90;
					} else {
						total += 10;
					}
					break;
				case 'C':
					if (s[i + 1] == 'D') {
						i++;
						total += 400;
					} else if (s[i + 1] == 'M') {
						i++;
						total += 900;
					} else {
						total += 100;
					}
					break;
				default:
					total += map[s[i]];
			}
		} else {
			total += map[s[i]];
		}
	}

	cout << total;

	return 0;
}