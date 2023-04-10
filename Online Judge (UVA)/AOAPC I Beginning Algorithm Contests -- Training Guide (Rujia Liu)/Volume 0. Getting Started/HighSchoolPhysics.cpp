#include <iostream>

int main(){
	int v, t;

	while(std::cin >> v){
		std::cin >> t;
		t *= 2;

		std::cout << v*t << std::endl;
	}
	return 0;
}