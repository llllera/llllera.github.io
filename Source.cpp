#include <iostream>
#include <ctime>
using namespace std;
int k=0;
void sortHoar(int * mas, int first, int last) {
	int mid, temp;
	int f = first, l = last;
	mid = mas[(f + l) / 2];
	k += 5;
	do {
		while (mas[f] < mid) {
			f++; k += 2;
		}
		k++;
		while (mas[l] > mid) {
			l--; k += 2;
		}
		k++;
		if (f <= l) {
			temp = mas[f];
			mas[f] = mas[l];
			mas[l] = temp;
			f++;
			l--;
			k += 5;
		}
		k++;
		k++;
	} while (f < l);
	k++;
	if (first < l) sortHoar(mas, first, l);
	k++;
	if (f < last) sortHoar(mas, f, last);
}
int main() {
	srand(time(0));
	for (int n = 100; n <= 10000; n += 100) {
		k = 0;
		for (int l = 0; l <= 2000; l++) {
			
			int* a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = rand() % 100;
			/*for (int i = 0; i < n; i++)
				cout << a[i] << " ";*/
			sortHoar(a, 0, n-1);
			/*cout << endl;
			for (int i = 0; i < n; i++)
				cout << a[i] << " ";
			cout << endl << k;*/
	
		}
		cout << n << ": " << float(k) / 2000 << endl;
	}
}