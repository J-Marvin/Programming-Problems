	// 458 The Decoder

	#include<iostream>

	using namespace std;

	int main(){

		string name;

		while(getline(cin, name)){
			for(int i = 0; i < name.length(); i++){
				name[i] = name[i] - 7;
			}

			cout << name << endl;		
		};


		return 0;
	}