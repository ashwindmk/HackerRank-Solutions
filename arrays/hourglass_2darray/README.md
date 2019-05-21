# HourGlass : 2D Array DS

Given a **6 x 6** 2D Array, **arr**:

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```

We define an hourglass in **A** to be a subset of values with indices falling in this pattern in **arr**'s graphical representation:

```
a b c
  d
e f g
```

So there will be **16** hourglasses in **arr**, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in **arr**, then print the maximum hourglass sum.

For example, given the 2D array:

```
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
```

Our highest hourglass value is **28** from the hourglass:
```
0 4 3
  1
8 6 6
```

### Function Description

Complete the function hourglassSum in the editor below. It should return an integer, the maximum hourglass sum in the array.

hourglassSum has the following parameter(s):

 + arr: an array of integers

### Constraints

 + -9 <= arr[i][j] <= 9
 + 0 <= i, j <= 5

### Sample Input

```
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
```

### Sample Output

```
19
```

### Solution

 + [Java Solution](https://github.com/ashwindmk/HackerRank-Solutions/blob/master/arrays/hourglass_2darray/java/HourGlass.java)
