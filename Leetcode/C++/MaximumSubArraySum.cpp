//https://leetcode.com/problems/maximum-subarray/

#include <iostream>
#include <vector>

using namespace std;

int getMaximumSubarray(vector<int> &nums) {
	int currSum = 0;
	int maxSum = INT_MIN;

	for(int i=0;i<nums.size();i++) {
		currSum += nums.at(i);
		maxSum = max(maxSum, currSum);
		currSum = max(currSum, 0);
	}

	return maxSum;
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

	cout << getMaximumSubarray(nums);

	return 0;
}