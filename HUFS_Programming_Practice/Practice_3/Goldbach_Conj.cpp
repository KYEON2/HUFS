#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;
int prime_number(int n);
int result;

int main() {
	int n, a = 0, b = 0, c = 0, len = 1;
	cout << "5보다 큰 홀수 n을 입력하세요 : ";
	cin >> n;
	cout << endl;
	int enter_1 = n;
	int enter_2 = n;
	while (enter_2 / 10 != 0) {
		len += 1;
		enter_2 = enter_2 / 10;
	}

	for (int j = 2; j < floor(n / 2) + 1; j++) {
		if (prime_number(j) == 1) {
			a = j; n -= j;
			for (int m = j; m < floor(n / 2) + 1; m++) {
				if (prime_number(m) == 1) {
					b = m; n -= m;
					if (prime_number(n) == 1) {
						c = n;
						goto print;
					}
					else {
						n += m;
						continue;
					}
				}
				else continue;
			}
			n += j;
		}
		else continue;

	}


print:
	cout << "입력 예 | 입력 예에 대한 출력" << endl; // 출력 창
	cout << "----------------------------------------" << endl;


	cout << enter_1;
	for (int i = 1; i < 19 - len; i++)
		cout << " ";
	cout << " | " << a << " " << b << " " << c; // 세 수 입력

	return 0;
}

int prime_number(int n) {
	if (n == 2) {
		result = 1;
		return result;
	}

	for (int i = 2; i <= floor(sqrt(n)); i++) {
		if (n % i == 0) {
			result = 0;
			return result;
		}
	}
	result = 1;
	return result;
}