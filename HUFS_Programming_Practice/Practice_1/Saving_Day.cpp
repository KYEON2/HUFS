#include <iostream>
#include <string>

using namespace std;


int main() {
	int year=0, month=0, day =0;
	long x;
	int result ;

	do{
		cout << "Enter Gregorian year (year >= 1583): ";
		cin >> year;
		int a = year;
		cout << "Enter Gregorian month (month: 1..12): ";
		cin >> month;
		int b = month;
		cout << "Enter Gregorian day (1..28|29|30|31): ";
		cin >> day;
		int c = day;
		result = 1;

		if (year >= 1583) 
		{
			if (1 <= month && month <= 12) 
			{
				switch (month) 
				{
					case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					{
						if (1 <= day && day <= 31)
						{
							year += 8000;
							if (month < 3) { year--; month += 12; }
							long julian = (year * 365) + (year / 4) - (year / 100) + (year / 400) - 1200820 + (month * 153 + 3) / 5 - 92 + (day - 1);
							x = julian % 7;
							string date[7] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
							cout << a << "-" << b << "-" << c << " is " << date[x];
							break;
						}
						else {
							cout << "Wrong day! Try again!\n" << endl; // ��¥�� Ʋ�� ���
							result = 0;
						}
							
					}break;
					

					case 4: case 6: case 9: case 11:
					{
						if (1 <= day && day <= 30)
						{
							year += 8000;
							if (month < 3) { year--; month += 12; }
							long julian = (year * 365) + (year / 4) - (year / 100) + (year / 400) - 1200820 + (month * 153 + 3) / 5 - 92 + (day - 1);
							x = julian % 7;
							string date[7] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
							cout << a << "-" << b << "-" << c << " is " << date[x];
							break;
						}
						else
							cout << "Wrong day! Try again!\n" << endl; 
						result = 0;
					} break;


					default:
					{
						if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
						{
							if (1 <= day && day <= 29)
							{
								year += 8000;
								if (month < 3) { year--; month += 12; }
								long julian = (year * 365) + (year / 4) - (year / 100) + (year / 400) - 1200820 + (month * 153 + 3) / 5 - 92 + (day - 1);
								x = julian % 7;
								string date[7] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
								cout << a << "-" << b << "-" << c << " is " << date[x];
								break;
							}
							else
								cout << "Wrong day! Try again!\n" << endl; 
							result = 0;
						}
						else
						{
							if (1 <= day && day <= 28)
							{
								year += 8000;
								if (month < 3) { year--; month += 12; }
								long julian = (year * 365) + (year / 4) - (year / 100) + (year / 400) - 1200820 + (month * 153 + 3) / 5 - 92 + (day - 1);
								x = julian % 7;
								string date[7] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
								cout << a << "-" << b << "-" << c << " is " << date[x];
								break;
							}
							else
								cout << "Wrong day! Try again!\n" << endl; 
								result = 0;
						}
					} break;
						
				
					

				}
				
			}
			else {
				cout << "Wrong month! Try again!\n" << endl; 
				result = 0;
			}
				
		}
		else {
			cout << "Wrong year! Try again!\n" << endl; 
			result = 0;
		}
			

	} while (result==0);


	return 0;
}
