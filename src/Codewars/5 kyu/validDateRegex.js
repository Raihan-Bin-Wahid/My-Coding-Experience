const validDate =
  /\[((0[2])-(2[0-8]|1[0-9]|0[1-9]))\]|\[(([0,1][1,3,5,7,8]|(12|10))-(3[0,1]|[1,2][0-9]|[0][1-9]))\]|\[([0,1][4,6,9,1]-(30|[1,2][0-9]|[0][1-9]))\]/;

console.log(validDate("[3] [06-29] [09-tenth]"));

//Passed: 108Failed: 107
