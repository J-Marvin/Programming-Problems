#include <iostream>
#include vector

using namespace std;

int solution(vector<int> &nums) {
	int low = 0, high = nums.size() - 1, mid = (high + low) / 2;

	while(low <= high) {
		mid = (high + low )/ 2;
		if (nums.at(mid + 1) < nums.at(mid))
			return nums.at(mid + 1);
		else if (nums.at(mid) < nums.at(mid - 1))
			return nums.at(mid);
		else if(nums.at(0) < nums.at(mid))
			low = mid + 1;
		else high = mid - 1;
	}

	return -1;

}

int main() {
	return 0;	
}