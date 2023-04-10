// 489 - Hangman Judge	

#include<iostream>
#include<map>
#include <iterator>

using namespace std;

int main(){

	int n;
	string temp;
	getline(cin, temp);

	n = stoi(temp);

	while(n != -1){
		string word, guess;
		int nGuesses = 0;

		std::map<char, bool> map;

		cout << "Round " << n << endl;
		getline(cin, word);
		getline(cin, guess);

		for(int i = 0; i < word.length(); i++){
			std::map<char, bool>::iterator it = map.find(word[i]);

			if(it == map.end()){
				map.insert(make_pair(word[i], false));
			}
		}

		std::map<char, bool>::iterator elem;
		bool won;

		for(int i = 0; i < guess.length(); i++){
			elem = map.find(guess[i]);

			if(elem != map.end()){
				if(elem->second)
					nGuesses ++;
				else elem -> second = true;
			} else {
				nGuesses ++;
			}

			if(nGuesses == 7){
				cout << "You lose." << endl;
				break;
			} else {
				won = true;
				for(std::map<char, bool>::iterator it = map.begin(); it != map.end() && won; it++){
					won = won && (it -> second);
				}

				if(won){
					cout << "You win." << endl;
					break;
				}
			}
		}
		
		if(!won && nGuesses < 7)
			cout << "You chickened out." << endl;

		getline(cin, temp);
		n = stoi(temp);
	}
	return 0;
}