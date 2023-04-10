	// 414 Machined Surfaces 

	#include<iostream>

	using namespace std;

	int main(){

		int max_space = 0;

		int n;
		string temp;

		getline(cin, temp);
		n = std::stoi(temp);
		while(n != 0){
			int spaces[n];
			max_space = 0;

			for(int i = 0; i < n; i++){
				int count = 0;

				string line;

				getline(cin, line);

				for(int j = 0; j < 26; j++){
					if(line[j] == 'X')
						count++;
				}

				spaces[i] = count;
				max_space = max(count, max_space);
			}

			int total = 0;

			for(int i = 0; i < n; i++){
				total += max_space - spaces[i];
			}

			cout << total << endl;

			getline(cin, temp);
			n = stoi(temp);
		}

		return 0;
	}