#include <iostream>
#include <string>


using namespace std;
int result = 0;

int vowel(char a);
int con(char a);

int main() {
	string a; int c = 0;
	cout << "������ �Է��ϼ��� :";
	getline(cin, a);
	int length = a.length();
	int plus = length;

	for (int i = 0; i < plus; i++) {
		if (con(a[i]) == 1) { //자음 1
			if (vowel(a[i + 1]) == 1) {  // 모음 2
				if (con(a[i + 2]) == 1) { //자음 3
					if (con(a[i + 3]) == 1) {  // 자음4
						if (con(a[i + 4]) == 1) {  // 자음5
							a.insert(i + 4, "|"); plus += 1;
							i += 4;
						}
						else if (vowel(a[i + 4]) == 1) { // 모음 5
							a.insert(i + 3, "|"); plus += 1;
							i += 3;
						}
						else {
							a.insert(i + 4, "|"); plus += 1;
							if ((i + 5) > plus)
								break;
							a.insert(i + 6, "|"); plus += 1;
							i += 6;
						}
					}
					else if (vowel(a[i + 3]) == 1) { /// 모음 4
						a.insert(i + 2, "|"); plus += 1;
						i += 2;
					}
					else {
						a.insert(i + 3, "|"); plus += 1;
						if ((i + 4) >= plus)
							break;
						a.insert(i + 5, "|"); plus += 1;
						i += 5;
					}
				}
				else if (vowel(a[i + 2]) == 1) { //모음 3
					if (con(a[i + 3]) == 1) { // 자음 4
						if (con(a[i + 4]) == 1) {  //자음 5
							a.insert(i + 4, "|"); plus += 1;
							i += 4;
						}
						else if (vowel(a[i + 4]) == 1) {  // 모음 5
							a.insert(i + 3, "|"); plus += 1;
							i += 3;
						}
						else {
							{
								a.insert(i + 4, "|"); plus += 1;
								if ((i + 5) >= plus)
									break;
								a.insert(i + 6, "|"); plus += 1;
								i += 6;
							}
						}
					}
					else {
						a.insert(i + 3, "|"); plus += 1;
						if ((i + 4) >= plus)
							break;
						a.insert(i + 5, "|"); plus += 1;
						i += 3;
					}
				}
				else {
					a.insert(i + 2, "|"); plus += 1;
					if ((i + 3) >= plus)
						break;
					a.insert(i + 4, "|"); plus += 1;
					i += 2;
				}
			}
			else {
				if ((i + 1) > plus)
					break;
			}
			continue;
		}
		else {
			if ((i + 1) > plus)
				break;
		}
	}


	if (a[plus - 1] != '|') {
		a.insert(plus, "|");
	}
	cout << a;
	return 0;
}

int vowel(char a) {
	if (a == 'k' || a == 'i' || a == 'j' || a == 'u' || a == 'h' || a == 'y' ||
		a == 'n' || a == 'b' || a == 'm' || a == 'l' || a == 'o' || a == 'p')
		result = 1;
	else
		result = 0;
	return result;
}

int con(char a) {
	if (a == 'r' || a == 's' || a == 'e' || a == 'f' || a == 'a' || a == 'q' || a == 't' || a == 'd' || a == 'w' || a == 'c'
		|| a == 'z' || a == 'x' || a == 'v' || a == 'g' || a == 'R' || a == 'E' || a == 'Q' || a == 'T' || a == 'W')
		result = 1;
	else
		result = 0;
	return result;
}