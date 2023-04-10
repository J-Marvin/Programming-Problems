	// 494 - Kindergarten

	#include<iostream>
	#include<sstream>
	#include<ctype.h>

	using namespace std;

	int main(){

		string s;
		bool isLetter = false;

		while(getline(cin, s)){
			int count = 0;

			isLetter = false;
			for(int i = 0; i < s.length(); i++){
				if(isalpha(s[i]) && !isLetter){
					count++;
					isLetter = true;
				} else if(!isalpha(s[i]))
					isLetter = false;
			}

			cout << count << endl;
		};

		return 0;
	}