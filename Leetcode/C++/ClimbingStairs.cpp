// https://leetcode.com/problems/climbing-stairs/

#include <iostream>
#include <vector>

int countSteps(int n) {
	int steps[n + 1];

	for(int i = n; i >= 1; i--) {
		if (i == n)
			steps[i] = 0;
		else if(i == n - 1)
			steps[i] = 1;
		else if (i == n-2)
			steps[i] = 2;
		else {
			steps[i] = steps[i + 1] + steps[i + 2];
		}

	}

	return steps[1] + 1;
}

int main() {
	int n;

	cin >> n;

	cout << countSteps(n);
}