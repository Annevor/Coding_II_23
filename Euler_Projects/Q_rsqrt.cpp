#include <iostream>
#include <math.h>

using namespace std;
 float number = 45;
 long i;
 float x2;
 float y;
 const float threehalfs = 1.5;

 x2 = number * 0.5;
 y  = number;
 i  = * ( long * ) &y;                       // evil floating point bit level hacking
 i  = 0x5f3759df - ( i >> 1 );               // what the fuck?
 y  = * ( float * ) &i;
 y  = y * ( threehalfs - ( x2 * y * y ) );   // 1st iteration
// y  = y * ( threehalfs - ( x2 * y * y ) );   // 2nd iteration, this can be removed

cout << y;