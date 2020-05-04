all: address size overflow zero without
address: main_san.c main_san.h
	gcc -o address main_san.c -fsanitize=address

size: main_san.c main_san.h
	gcc -o size main_san.c -fsanitize=object-size

overflow: main_san.c main_san.h
	gcc -o overflow main_san.c -fsanitize=signed-integer-overflow

zero: main_san.c main_san.h
	gcc -o zero main_san.c -fsanitize=float-divide-by-zero

without: main_san.c main_san.h
	gcc -o without main_san.c