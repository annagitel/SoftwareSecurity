#include <stdio.h>
#include <limits.h>
#include "main_san.h"
void address_sanitizer(){
	int x[4] = {1, 2, 3, 4};
    printf("address: %d\n", x[5]);
}

void object_size_sanitizer(){
    int a[4] = {1, 2, 3, 4};
    for (size_t i = 0; i <= sizeof(a) / sizeof(a[0]); i++){
        printf("object size: %d\n", a[i]);
    }
}

void signed_integer_overflow_sanitizer(){
    int a = INT_MAX;
    a = a+10;
    printf("singed int: %c\n", a);
}

void float_divide_by_zero_sanitizer(){
    float num = 10;
    num = num/0;
    printf("float devide: %f\n", num);
}

int main(){
	printf("welcome to the program \n");
    address_sanitizer();
    object_size_sanitizer();
    signed_integer_overflow_sanitizer();
    float_divide_by_zero_sanitizer();

	return (0);
}