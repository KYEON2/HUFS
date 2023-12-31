#include <iostream>
#include <iomanip>
int calender(int month, int start, int year);

using namespace std;
int days[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };
string months[12] = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

int main() {
	int month = 1, day = 1;
	int year, year2, i, j;
	long x;
	

	cout << "Enter Gregorian year (year >= 1583): ";
	cin >> year;
	year2 = year;


	if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
	{
		days[1] = 29;
	}

	year += 8000;
	if (month < 3) { year--; month += 12; }
	long julian = (year * 365) + (year / 4) - (year / 100) + (year / 400) - 1200820 + (month * 153 + 3) / 5 - 92 + (day - 1);
	x = julian % 7;

	

	for (i = 1; i <= 12; i++) {
		for (j = 0; j < 12; j++)
		{
			x = calender(j, x, year2);
		}
		return 0;
		cout << endl << endl;
		return x;
	}

	
	}
	


int calender(int month, int start,int year)
{
	int i = 0;
	cout << "               " << months[month] << "    " << year << endl; 
	cout << "     M" << "     T" << "     W" << "     T" << "     F" << "     S" << "     S" << endl;
	
	for (i = 0; i < start; i++)
	{
		cout << "      ";
	}
	for (i = 0; i < days[month]; i++) 
	{
		cout << setw(6) << i+1;
		start++;
		if (start == 7)
		{
			start = 0;
			cout << endl;
		}
	}
	cout << endl << endl << endl;
	return start;
}
