import java.text.DecimalFormat

fun main() {
    //Declare Variables
    var itemCost = 0.0
    var totalCost = 0.0
    val tax = .025
    val tip = .175
    val currency = DecimalFormat("\$###,###,###.00")
    var choice = 0
    var totalTax = ""
    var totalWithTax = ""

    //Keep adding items to total until user selects 0
    println("==================== TIP CALCULATOR ==============")
    do {
        print("Enter the cost of the item: ")
        itemCost = readLine()!!.toDouble()
        totalCost += itemCost
        println("Total cost is: ${currency.format(totalCost)}")
        println("==============================================")
        println("Enter 1: Add another item \nEnter 0: To Quit")
        choice = readLine()!!.toInt()

    } while (choice != 0)

    //Calculate and print the results
    println("================= RESULTS =============================")
    println("The total cost is: ${currency.format(totalCost)}")
    totalTax = currency.format(totalCost * tax)
    println("2.5% tax is: $totalTax")
    totalWithTax = currency.format(totalCost * 1.025)
    println("The total with tax is: $totalWithTax")
    println("We recommend that you leave a 17.5% tip, which is: ${currency.format(totalCost * 1.025 * tip)}")
}