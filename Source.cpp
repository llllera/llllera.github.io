#include <iostream>
using namespace std;
#include <ctime>

//const int SIZE = 1000;
//short Picture [SIZE][SIZE];
//void F(int raz, int adri, int adrj, int n) {
//	int i1, i2;
//	if (adri > n || adrj + raz -1 > n || adri + raz - 1 > n) return;
//	for (int i = adri; i < adri + raz; i++)
//		for (int j = adrj; j < raz + adrj; j++)
//			if (Picture[i][j] == 1) return ;
//	
//	if (raz % 2 == 0) {
//		i1 = raz / 2 - 2+ adri;
//		i2 = raz / 2 + adri;
//	}
//	else {
//		i1 = raz / 2 - 1 + adri;
//		i2 = raz / 2 +1+ adri;
//	}
//	if (i1 > 0 && i2 > 0) {
//		for (int j = adrj; j < raz + adrj; j++) {
//			Picture[i1][j] = 1;
//			Picture[i2][j] = 1;
//		}
//	}
//	else return;
//	for (int i = adri, j = adrj+raz-1; i < adri+raz; i++, j--)
//		Picture[i][j] = 1;
//}
//void S(int& k, int n) {
//	/*int flag = 0; 
//	k++;*/
//	for (int i = 0; i < n; i++) 
//		for (int j = 0; j < n; j++) {
//			if (Picture[i][j] == 1) {
//				int i1 = i, j1 = j, f = 0; 
//				k += 2;
//				k += 1;
//				while (Picture[i1][j1] != 0) {
//					i1++;
//					j1--;
//					k += 3;
//				}
//				k++;
//				j1++; i1--;
//				int raz = i1 - i + 1, adri = i, adrj = j1, i2, i3;
//				k += 7;
//				if (raz > 4) {
//					f = 1;
//					if (raz % 2 != 0) {
//						i2 = raz / 2 - 1 + adri;
//						i3 = raz / 2 + 1 + adri;
//						k += 8;
//					}
//					else {
//						i2 = raz / 2 - 2 + adri;
//						i3 = raz / 2 + adri;
//						k += 7;
//					}
//					k += 2;
//					for (int j2 = adrj; j2 < raz + adrj; j2++) {
//						if (Picture[i2][j2] == 0) {
//							f = 0; k++; break;
//						}
//						if (Picture[i3][j2] == 0) {
//							f = 0; k++; break;
//						}
//						Picture[i2][j2] = 0;
//						Picture[i3][j2] = 0;
//						k += 4;
//					}
//				}
//				k++;
//				for (int i = adri, j = adrj + raz - 1; i < adri + raz; i++, j--) {
//					Picture[i][j] = 0; k++;
//				}
//				/*if (f == 1) {
//					flag = 1;
//					cout << "Koordinat: (" << i << ", " << j1 << ") (" << i1 << ", " <<j << ")";
//					k++;
//				}
//				k++;*/
//			}
//			k++;
//		}
//	
//}
//int main() {
//	
//	for (int n = 100; n <= 1000; n+=100) {
//
//		int k = 0;
//		for (int l = 0; l <= 1000; l++) {
//			for (int i = 0; i < n; i++) {
//				for (int j = 0; j < n; j++)
//					Picture[i][j] = 0;
//			}
//			srand(time(NULL));
//			for (int j = 0; j < rand() % n; j++) {
//				int raz = rand() % n / 4, adri = rand() % n / 4, adrj = rand() % n / 4;
//				F(raz, adri, adrj, n);
//			}
//			S(k, n);
//		}
//		cout <<endl<< n << ": " << k / 1000;
//	}
//}

int k = 0;
void sortHoar(int* mas, int first, int last) {
	int mid, temp, f = first, l = last;
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
		k += 2;
	} while (f < 1);
	k++;
	if (first < l) sortHoar(mas, first, l);
	k++;
	if (f < last) sortHoar(mas, f, last);
}
int main() {
	for (int n = 100; n <= 10000; n += 100) {
		k = 0;
		srand(time(NULL));
		int* a = new int[n];
		for (int l = 0; l <= 1000; l++) {
			
			for (int i = 0; i < n; i++)
				a[i] = rand() % 100;
			sortHoar(a, 0, n - 1);
		}
		cout << n << ": " << k / 1000 << endl;
	}

}