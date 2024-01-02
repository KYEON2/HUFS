#include <iostream>

using namespace std;

int main() {
	long n, m, p, number = 0;

	cout << "Please enter an interger number (n>=2): ";
	cin >> n;

	for (long i = 2; i <= n; i++)
	{
		p = 1;
		for (long j = 2; j*j <= i; j++)
		{
			if (i % j == 0) {
				p = 0;
				break;
			}
		}
		if (p == 1)
			number++;

	}

	cout << "The number of prime numbers between 2 and " << n << " is " << number;
} 
