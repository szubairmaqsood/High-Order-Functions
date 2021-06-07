/*
It accepts one integer as parameter
and returns a int
as it is one line so we not used brackets and iny
 */
fun square(x: Int) = x * x;

/*
1.it is a function which accepts no parameters
2.it returns a function which accepts integer and return integer
*/
fun operation():(Int) ->Int{
    return ::square;
}

fun mainFunctionWhichCallForOperationWhichReturnsFunctions(){
    val function = operation();
    println(function(2));
}
