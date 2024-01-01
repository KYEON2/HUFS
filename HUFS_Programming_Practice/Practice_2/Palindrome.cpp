#include  <iostream>
#include <string>
#define UM_UPDATEDATA (WM_USER+1)

using namespace std;

int main() {
	string letter;
	int i, result=1, m;

	cout << "Please enter a string (length < 100): ";
	cin >> letter;

	m = letter.size();
	for (i = 0; i < m/2; i++); { 
		if (letter[i] != letter[m - i - 1]) { 
			result = 0;
		}
		
	}

	if (result == 1)
		cout << letter << " is a palindrome.";
	else
		cout << letter << " is NOT a palindrome.";

	return 0; 
}
