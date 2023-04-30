// https://leetcode.com/problems/min-cost-climbing-stairs/description/
// 

#include <iostream>
#include <vector>

int getMinCost(vector<int> &costs) {
	int minCosts[costs.size() + 1];

	for(int i = costs.size(); i >= 0; i--) {
		if (i == costs.size())
			minCosts[i] = 0;
		else if (i == costs.size() - 1)
			minCosts[i] = costs.at(i);
		else if (i == costs.size() - 2) 
			minCosts[i] = costs.at(i);
		else {
			minCosts[i] = min(costs.at(i) + minCosts[i + 1], costs.at(i) + minCosts[i + 2]);
		}
	}

	return min(minCosts[0], minCosts[1]);

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

	cout << getMinCost(nums);
}