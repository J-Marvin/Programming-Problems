//https://leetcode.com/problems/product-of-array-except-self/
//
#include <iostream>
#include <vector>

using namespace std;

vector<int> productExceptSelf(vector<int>& nums) {
	vector<int> products;
	int product = 1;
	bool hasZero = false;

	for(int i = 0; i < nums.size(); i++) {
		if (nums.at(i) == 0 && !hasZero)
			hasZero = true;
		else 
			product *= nums.at(i);

	}

	for(int i = 0; i < nums.size(); i++) {
		if (nums.at(i) == 0)
			products.push_back(product);
		else if (hasZero)
			products.push_back(0);
		else products.push_back(product/nums.at(i));
	}

	return products;
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

	nums = productExceptSelf(nums);

	for(int i = 0; i < n; i++) {
		cout << nums.at(i) << ' ';
	}
}