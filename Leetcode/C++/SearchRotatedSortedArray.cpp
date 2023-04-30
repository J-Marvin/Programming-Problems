// https://leetcode.com/problems/search-in-rotated-sorted-array/
// 
#include <iostream>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

int search(vector<int>& nums, int target) {
	int i = 0;
	int targetInd = -1;
	unordered_set<int> visited;

	do {
		visited.insert(i);

		if (nums.at(i) == target)
			targetInd = i;
		else if (nums.at(i) < target)
			i++;
		else
			i--;

		i = (i + nums.size()) % nums.size();
	} while (visited.find(i) == visited.end() && targetInd == -1);

	return targetInd;
}

int main() {
	int n, target;
	vector<int> nums;

	cin >> n >> target;

	for(int i=0;i<n;i++) {
		int temp;
		cin >> temp;
		nums.push_back(temp);
	}

	cout << search(nums, target);

	return 0;
}