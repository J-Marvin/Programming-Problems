// 694 Collatz

#include<iostream>

using namespace std;

int main(){

	int count;
	int a;
	int l;
	int c = 1;


	do{
		cin >> a >> l;

		if(a > 0 && l > 0){
			count = 0;
			cout << "Case "
				 << c
				 << ": "
				 << "A = " << a << ", "
				 << "limit = " << l << ", ";

			long long int temp = a;

			while(temp != 1 && temp <= l){
				if(temp % 2 == 0){
					temp /= 2;
				} else {
					temp = temp * 3 + 1;
				}
					count++;
			}

			if(temp <= l)
				count++;

			cout << "number of terms = " << count << endl;
			c++;
		}
	} while( a > 0 && l > 0);
	return 0;
}
