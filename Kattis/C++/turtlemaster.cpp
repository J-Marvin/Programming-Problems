// https://open.kattis.com/problems/turtlemaster
// 
#include <iostream>
#include <string>

using namespace std;

int main() {

	string board[8];
	string directions;
	bool done = false;
	bool diamond = false;

	// dir
	// 0 - right
	// 1 - down
	// 2 - left
	// 3 - up
	//  + 1 if rotate to the right
	//  - 1 if rotate to the left
	int x = 0, y = 7, dir = 0;
	for(int i = 0; i < 8; i++)
		getline(cin,board[i]);

	board[7][0] = '.';
	getline(cin, directions);


	for(int i = 0; i < directions.length() && !done; i++) {
		char c = directions[i];

		switch(c) {
		case 'F':
			switch(dir){
			case 0: x++; break;
			case 1: y++; break;
			case 2: x--; break;
			case 3: y--; 
			}

			if(x >= 8 || y >= 8 || x < 0 || y < 0)
				done = true;
			else {
				if (board[y][x] == 'C' || board[y][x] == 'I')
					done = true;
				else if (board[y][x] == 'D') {
					done = true;
					diamond = true;
				}
			}
			break;
		case 'R':
				dir++;
				dir%=4;
			break;
		case 'L':
				dir--;
				dir += 4;
				dir %= 4;
			break;
		case 'X':
			bool castle = false;
			switch(dir) {
			case 0:
				for(int i = x + 1; i < 8 && !castle; i++)
					if(board[y][i] == 'I') {
						castle=true;
						board[y][i] = '.';
					}
				break;
			case 1:
				for(int i = y + 1; i < 8 && !castle; i++)
					if(board[i][x] == 'I') {
						castle=true;
						board[i][x] = '.';
					}
				break;
			case 2:
				for(int i = x - 1; i >= 0 && !castle; i++)
					if(board[y][i] == 'I') {
						castle=true;
						board[y][i] = '.';
					}
				break;
			case 3:
				for(int i = y - 1; i >= 0 && !castle; i++)
					if(board[i][x] == 'I') {
						castle=true;
						board[i][x] = '.';
					}

			}

			if (!castle)
				done=true;
			break;
		}
	}

	if (diamond)
		cout << "Diamond!";
	else cout << "Bug!";
	return 0;
}