/*
it is the function which accepts two parameters
1. first two arguments are of type int
2. third parameter local name is operation
3. third parameters takes two integer and returns int
4. When we call calculate we pass ::sum  here :: mean pass reference by name
*/
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

//It is the function whose address will be passed
fun sum(x: Int, y: Int) = x + y

fun passFunctionAsArgument(){
    calculate(3,5,::sum)
}