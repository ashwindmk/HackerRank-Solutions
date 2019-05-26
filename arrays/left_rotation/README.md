# Arrays: Left Rotation

A left rotation operation on an array shifts each of the array's elements **1** unit to the left. For example, if **2** left rotations are performed on array **[1, 2, 3, 4, 5]**, then the array would become **[3, 4, 5, 1, 2]**.

Given an array **a** of **n** integers and a number, **d**, perform **d** left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

### Function Description

Complete the function rotLeft in the editor below. It should return the resulting array of integers.

rotLeft has the following parameter(s):
 + An array of integers **a**.
 + An integer **d**, the number of rotations.

### Constraints

 + 1 <= n <= 10<sup>5</sup>
 + 1 <= d <= n
 + 1 <= a[i] <= 10<sup>6</sup>

### Sample Input

```
5 4
1 2 3 4 5
```

### Sample Output

```
5 1 2 3 4
```

### Solution

[Java Solution](https://github.com/ashwindmk/HackerRank-Solutions/blob/master/arrays/left_rotation/java/LeftRotation.java)
