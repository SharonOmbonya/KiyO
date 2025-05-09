
fun main() {
    // Prompting the user to enter the first number
    print("Enter initial number: ")
    val num1 = readLine()!!.toDouble()

    // Prompting the user to enter the second number
    print("Enter final7 number: ")
    val num2 = readLine()!!.toDouble()

    // Prompting the user to choose an operation
    print("Choose an operation (+, -, *, /): ")
    val operation = readLine()

    // Determine the operation and display the result
    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> {
            if (num2 != 0.0) num1 / num2 else "Division by zero is undefined"
        }
        else -> "Invalid operation"
    }

    println("Result: $result")
}
