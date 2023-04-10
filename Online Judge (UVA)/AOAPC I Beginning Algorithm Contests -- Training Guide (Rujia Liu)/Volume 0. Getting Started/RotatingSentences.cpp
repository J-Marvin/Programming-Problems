// 490 Rotating Sentences

#include <iostream>
#include <vector>

using namespace std;

int main(){

	vector<string> sentences;

	string s;
	int max_length = 0; 

	while(getline(cin, s)){
		sentences.push_back(s);
		max_length = max(max_length, (int)(s.length()));
	}

	for(int i = 0; i < max_length; i++){
		for(int j = sentences.size() - 1; j >= 0; j--){
			if(sentences[j].length() > i)
				cout << sentences[j][i];
			else cout << " ";
		}

		cout << endl;
	}

	return 0;
}