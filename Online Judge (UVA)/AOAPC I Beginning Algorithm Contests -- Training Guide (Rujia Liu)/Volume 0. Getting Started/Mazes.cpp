// 445 Marvelous Mazes	

#include<iostream>
#include<ctype.h>

using namespace std;

int main(){
	string s;

	while(getline(cin, s)){
		if(s.length() > 0){
			for(int i = 0; i < s.length(); i++){
				if(isdigit(s[i])){
					int times = s[i] - '0';
					i++;

					while(isdigit(s[i])){
						times += s[i++] - '0';
					}

					for(int j = 0; j < times; j++){
						if(s[i] == 'b')
							cout << " ";
						else if(s[i] == '!')
							cout << endl;
						else cout << s[i];

					}
				} else {
					if(s[i] == 'b')
						cout << " ";
					else if(s[i] == '!')
						cout << endl;
					else cout << s[i];
				}
			}
		}

		cout << endl;
	}

	return 0;
}