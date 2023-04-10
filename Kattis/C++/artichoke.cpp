// problem	

#include<iostream>
#include<cmath>

using namespace std;

int main(){
	double p, a, b, c, d, n;

	cin >> p >> a >> b >> c >> d >> n;

	double decline = 0;
	double highest;
	double lowest;

	double currStock = p * (sin(a * 1 + b) + cos(c * 1 + d) + 2);
	highest = lowest = currStock;
	for(double i = 2; i <= n; i++){
		currStock = p * (sin(a * i + b) + cos(c * i + d) + 2);

		if(currStock < lowest){
			lowest = currStock;
			decline = max(highest - lowest, decline); 
		} else if(currStock > highest){
			lowest = highest = currStock;
		}
	}

	printf("%.8lf", decline);
	return 0;
}