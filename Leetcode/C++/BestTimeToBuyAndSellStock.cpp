#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int getMaxProfit(vector<int>& prices) {
	int buyP;
	int maxP = 0;
	buyP = prices.at(0);
	for(int i = 1; i < prices.size(); i++) {
		buyP = min(buyP, prices.at(i));
		maxP = max(maxP, prices.at(i) - buyP);
	}
	return maxP;
}

int main() {
	int n;
	vector<int> prices;

	cin >> n;

	for(int i=0; i < n; i++) {
		int temp;
		cin >> temp;
		prices.push_back(temp);
	}

	cout << getMaxProfit(prices);
}