// Vauvau	

#include<iostream>

using namespace std;

int a, b, c, d;

void vau(int time) {

	int timeA = time % (a + b + 1);
	int timeB = time % (c + d + 1) ;

	if(timeA <= a && timeB <= c)
		cout << "both" << endl;
	else if(timeA <= a || timeB <= c)
		cout << "one" << endl;
	else cout << "none" << endl;

}

int main(){

	int p, m, g;

	cin >> a >> b >> c >> d >> p >> m >> g;

	vau(p);
	vau(m);
	vau(g);
	return 0;
}

