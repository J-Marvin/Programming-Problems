// https://leetcode.com/problems/coin-change/
// 
#include <iostream>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int solution (vector<int> coins, int n) {
	sort(coins.begin(), coins.end());

	int count = 0;
	cout << n << endl;
	for(int i = coins.size() - 1; i >= 0; i--) {
		count += n/coins.at(i);
		n %= coins.at(i);
		cout <<coins.at(i) << ' ' << n  << ' ' << count << endl;
	}


	if (n != 0)
		return -1;
	return count;

}


int main() {
	vector<int> nums = {186, 419, 83, 408};
	int target = 6249;

	cout << solution(nums, target);

	return 0;
}