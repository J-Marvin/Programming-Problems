

//https://open.kattis.com/problems/1dfroggereasy

#include <iostream>
#include <set>

using namespace std;

int main() {

	// n is board size
	// m is magic number
	// s is starting index
	int n, s, m, h = 0;
	set<int> visited; 

	cin >> n >> s >> m;

	int board[n];

	for (int i = 0; i < n; i++) {
		cin >> board[i]; 
	}

	s--;

	bool done = false;

	while (!done) {
		if (s < 0) {
			cout << "left" << endl;
			done = true;
		} else if (s >= n) {
			cout  << "right" << endl;
			done = true;
		} else if (visited.find(s) != visited.end()) {
			cout << "cycle" << endl;
			done = true;
		} else if (board[s] == m) {
			cout << "magic" << endl;
			done = true;
		} else {
			visited.insert(s);
			h++;
			s += board[s];
		}
	}

	cout << h;

	return 0;
}

