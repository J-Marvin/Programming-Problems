#include <stdio.h>
#include <math.h>

int isHappy(int n){
	long product = n;
	int temp = n;
	long num;
	
	while(product != 1){
		num = 0;
		
		while(product > 0){
			num += pow(product % 10, 2);
			product /= 10;
		}
		
		product = num;
		
		if(product == temp)
			return 0;
	}
	
	return 1;
}

int main(){
	int n;
	
	printf("Enter number: ");
	scanf("%d", &n);
	
	printf("%d", isHappy(n));
	return 0;	
}
