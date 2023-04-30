#include <iostream>
#include <vector>
#include <bits/stdc++.h>

using namespace std;

bool containsDuplicate(vector<int>& nums) {
	unordered_set<int> n;

	for(int i = 0; i < nums.size(); i++) {
		if (n.find(nums.at(i)) == n.end()) {
			n.insert(nums.at(i));
		} else {
			return true;
		}
	}

	return false;
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

	cout << containsDuplicate(nums);
}