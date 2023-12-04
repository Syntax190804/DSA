#include<iostream>
using namespace std;

void heapify(int arr[], int n, int j) 
{
	int temp;
	int largest = j;
	int left = 2 * j + 1; 
	int right = 2 * j + 2; 
	if (left < n && arr[left] > arr[largest]) 
	largest = left; 
	if (right < n && arr[right] > arr[largest]) 
	largest = right;
	if (largest != j) 
	{
		temp = arr[j];
		arr[j] = arr[largest];
		arr[largest] = temp; 
		heapify(arr, n, largest); 
 	}
}

void heapSort(int arr[], int n) 
{
	int temp;
	for (int i = n / 2 - 1; i >= 0; i--)
	heapify(arr, n, i); //n=10,i=4
	for (int k = n - 1; k >= 0; k--) 
	{
		temp = arr[0]; 
		arr[0] = arr[k];
		arr[k] = temp; 
		heapify(arr, k, 0); 
 	}
}

int main() 
{
	int arr[] = { 20, 7, 1, 54, 10, 15, 90, 23, 77, 25};
	int n = 10;
	int i;
	cout<<"Given array is: "<<endl;
	for (i = 0; i<n; i++)
	cout<<arr[i]<<" ";
	cout<<endl;
	heapSort(arr, n);
	cout<<"\nSorted array is: \n";
	for (i = 0; i < n; i++)
	cout<<arr[i]<<" ";
}

