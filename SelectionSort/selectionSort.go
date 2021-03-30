package main

import "fmt"

func main() {
 var min int
 var minIndex int
 var temp int
 arr := []int{6, 7, 1, 9, 5, 2}

 for i:=0;i<len(arr);i++ {
   min = arr[i]
    
   for j:=i;j<len(arr);j++ {
     if arr[j] < min {
       min = arr[j]
       fmt.Println(min)
       minIndex = j
       }
   }
   fmt.Println(arr)
   temp = arr[i]
   arr[i] = min
   arr[minIndex] = temp
 }
 
 fmt.Println(arr)
 
}
