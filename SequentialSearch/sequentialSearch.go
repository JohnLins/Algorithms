package main

import "fmt"

func main(){
   arr := []int{6, 3, 4, 1}
   target := 3
   for i := 0; i < len(arr); i++ {
	if arr[i] == target {
		fmt.Println("Found", arr[i])
	}
   	
   }

	
}
