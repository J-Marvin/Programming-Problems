#include <iostream>
#include <vector>
using namespace std;

vector<int> twoSum(vector<int> &nums, int target) {
	vector<int> answer;
	bool found = false;

	for(int i = 0; i < nums.size() && !found; i++) {
		for(int j = i + 1; j < nums.size() && !found; j++)
			if (nums.at(i) + nums.at(j) == target) {
				answer.push_back(i);
				answer.push_back(j);
				found=true;
			}
	}

	return answer;
}

int main() {
	int n;
	int target;
	vector<int> nums;

	cin >> n >> target;

	for(int i = 0; i < n; i++) {
		int n;
		cin >> n;
		nums.push_back(n);
	}

	nums = twoSum(nums, target);

	for(int i =0; i < 2; i++) {
		cout << nums.at(i) << " ";
	}



	return 0;
}