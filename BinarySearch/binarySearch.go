package main

import (
	"fmt"
)

func main() {
	found := false
	
	target := 64
	arr := []int{2, 4, 6, 7, 9, 10, 20, 64}

	

	for found == false {
		try := arr[len(arr)/2]
	
		if try == target {
			found = true
		} else if try > target {
			arr = arr[0:len(arr)/2]
			
		} else if try < target {
			arr = arr[len(arr)/2:len(arr)]
		}
		fmt.Println(try)
	}
	fmt.Println(found)
}
