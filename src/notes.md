# Array Notes

### Accessing the last element of an array

This is how you ***always*** access the last element of any array

```java
arrayName[arrayName.length-1]
```
### Array Declartion
There are 3 ways to declare an array. The most common way is to declare and initialize in the same line. For Example

```java
int[] nums = new int[10];
double[] vals = new double[10];
boolean[] flags = new boolean[10];
String[] names = new String[10];
```
Second way, less common, is to declare an array, and later initialize it

```java
int nums[];
//some code goes here
//later I initialize the array
nums = new int[10];
```
Third way is to use an array initializer. We can only do this if we know the values in the array

```java
int nums[] = {3,5,7,8,1};
double vals[] = 3.4,5.6,4.5,6.4};
boolean flags[] = {true, false,true};
String names[] = {William, Will};
```
### Looping Through an Array

If you see an array, the odds of looping through it to solve some problems at > 95%

```java
int a[] = new a[100]
for(int i=0; i<a.length; i++){
    int currentElement = a[i];
    //code to process the current element
}
```

Using a for-each or enhanced for-loop

```java
int a[] = new int[100]
for(int currentElement: a){
    //currentElement already exist
    //code to process the current element
}
```
For-each loop notes

- You do not know where you are in a for-each loop
- You cannot change the structure of an array in a for-each loop

### Common Array Algorithms

Finding max/min in integer array

```java
public int findMax(in a[]){
    int max = a[0];

    for(int i=0; i<a.length; i++);
        int currenElement = a[i];
        if(currentElement > max) {
            max = currentElement;
        }
    }
    return max;
}
```
Finding Average
```java
public double average(int a[]){
    int total = 0;
    for(int i=0; i<a.length; i++){
        total += a[i];
    }
    return total/a.length;
}
```
Search for a value
```java
//will return the index where the key is found, -1 if not found
punlic int search(int a[], int key){
    for(int i=0; i<a.length; i++){
        int currentValue = a[i];
        if(currentValue == key)//we found it!!!
            return i;//return WHERE you found it
    }
    return -1;// if we don't find it, return -1
}
```
### Array Out Of Bounds Exception

It occurs when you try to access
- arrayName[arrayName.length]
- arrayname[arrayName.length+1]
- arrayName[arrayName.length+n]



```java
arrayName[i];
```
Make sure i is always less than the array length

