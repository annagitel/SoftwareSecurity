# softwareSecurity1
Anna Gitel Sandler 208749648

Software security course asigment. 

 ### Java language 
The first part was to demonstrate how avoid calling null object and how to avoid getting null pointer exception.
all examples included demonstration on files. 
the program contains 2 examples, each of them 2 functions - one problematic and one fixed:

first exaple: opening a file that do not exist `public static void no_file()` & `public static void no_file_fixed()`  
  
second example: reading a line that do not exist, from a file `public static void no_line_in_file() throws FileNotFoundException` & `public static void no_line_in_file_fixed() throws FileNotFoundException`  

expceted output: 
```
1: Running function without existing file, should catch NullPointerException
NullPointerException catched: null

2: Running function without existing file, null should be checked inside
file does not exist

3: Running function without existing line in file, should catch NoSuchElementException
first line
second line
thirdl ine
NoSuchElementException catched: No line found

4: Running function without existing line in file, null should be checked inside
first line
second line
thirdl ine
No more lines
```

### C language
The second part was to demonstrate 4 gcc sanitizer functionalities. 

what is gcc sanitizer? an open source programming tool by Google that detects memory corruption bugs such as buffer overflows or accesses to a dangling pointer or any runtime errors

the functionalities I picked are: 
1. `-fsanitize=address` - ast memory error detector to detect out-of-bounds and use-after-free bugs. 
2. `-fsanitize=object-size` -  instrumentation of memory references using the builtin_object_size function.
3. `-fsanitize=signed-integer-overflow` - signed integer overflow checking.
4. `-fsanitize=float-divide-by-zero` - Detect floating-point division by zero. 

The make file creates 5 executable files -
* `without` running the proggram without any sanitizer rules  
* `address` running with the address sanitizer check  
expected output: ` ==783895==ERROR: AddressSanitizer: stack-buffer-overflow on address 0x7ffe665dca04 at pc 0x000000401347 bp 0x7ffe665dc9c0 sp 0x7ffe665dc9b0 `
* `size` running with the object size sanitizer check  
expected output: `  runtime error: load of address 0x7ffeedc12394 with insufficient space for an object of type 'int' `
* `overflow` running with the singed int overflow sanitizer check  
expected output: ` runtime error: signed integer overflow: 2147483647 + 10 cannot be represented in type 'int' `
* `zero` running with the zero devision sanitizer check  
expected output: `runtime error: division by zero`
