// https://leetcode.com/problems/largest-number-at-least-twice-of-others/
// 
#include <iostream>
#include <vector>
#include <bits/stdc++.h>

using namespace std;
int dominantIndex(vector<int> &nums) {
	int domIndex = 0;
	int domIndex2 = 0;

	if (nums.at(0) > nums.at(1)) {
		domIndex2 = 1;
	} else {
		domIndex=0;
	}


	for(int i = 2; i < nums.size(); i++) {
		if (nums.at(i) > nums.at(domIndex)) {
			domIndex2 = domIndex;
			domIndex = i;
		} else if (nums.at(i) > nums.at(domIndex2))
			domIndex2 = i;
	}

	if (nums.at(domIndex2) * 2 <= nums.at(domIndex))
		return domIndex;
	else return -1;
}


int main() {
	int n;
	vector<int> nums;

	cin >> n;

	for(int i=0;i<n;i++) {
		int temp;
		cin >> temp;
		nums.push_back(temp);
	}

	cout << dominantIndex(nums);
}