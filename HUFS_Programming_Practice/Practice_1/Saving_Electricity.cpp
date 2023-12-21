#include <iostream>
#include <cmath>

using namespace std;

int main() {
	int month;
	long x, b; //
	double a;
	double use;
	long elect;
	double tax, total;
	cout << "Please enter a month (1~12): ";
	cin >> month;

	switch (month) {
	case 1: case 2: case 7: case 8: case 12:
		cout << "Please enter a kWh (interger): ";
		cin >> x;
		if (x <= 200) {
			use = x * 93.3;
			elect = floor(910 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax)*0.1) * 10;

			cout << "Electric charge is " << total;
		}


		else if (200 < x && x <= 400) {
			use = 200 * 93.3 + (x - 200) * 187.9;
			elect = floor(1600 + use) ;
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;

			cout << "Electric charge is " << total;

		}


		else if (400 < x && x <= 1000) {
			use = 200 * 93.3 + 200 * 187.9 + (x - 400) * 280.6;
			elect = floor(7300 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;

			cout << "Electric charge is " << total;
		}

		else {
			use = 200 * 93.3 + 200 * 187.9 + 600 * 280.6 + (x-1000) * 709.5;
			elect = floor(7300 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;

			cout << "Electric charge is " << total;
		}


		break;


	default:
		cout << "Please enter a kWh (interger): ";
		cin >> x;
		if (x <= 200) {
			use = x * 93.3;
			elect = floor(910 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;
			cout << "Electric charge is " << total;
		}


		else if (200 < x && x <= 400) {
			use = 200 * 93.3 + (x - 200) * 187.9;
			elect = floor(1600 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;

			cout << "Electric charge is " << total;

		}

		else {
			use = 200 * 93.3 + 200 * 187.9 + (x - 400) * 280.6;
			elect = floor(7300 + use);
			a = round(elect * 0.1 * 0.1) * 10; 
			b = floor(elect * 0.037 * 0.1) * 10;
			tax = a + b;
			total = floor((elect + tax) * 0.1) * 10;

			cout << "Electric charge is " << total;
		}


		break;
	}
}