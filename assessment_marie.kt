fun main(){
    var acc=CurrentAccount("3456,","tito",1000.00)
    println(acc.deposit(downTo()))
    println(acc.withdraw(500.00))
    acc.details()
    var save=SavingsAccount("45j","kabare",333,2)
    println(save.deposit(34567))
    println(save.withdraw(5678))
    println(save.withdraw(5678)
    save.details()
 data class books(var title:String,var author:Double,var page:Int,)open class CurrentAccount(var accNo:String,var accName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance+=amount
        return balance
    }
    open fun withdraw(amount:Double):Double{
        balance-=amount
        return balance
    }
    fun details(){
        println("Account number $accNo with balance $balance is operated by $accName")
    }
}
var num = or(3000)
do {
    println("Loop: $num")
    num++
}
while (num>=3000)

fun evenString(names:List<String>):List<String>{
   var x= mutableListOf<String>()
   names.forEachIndexed { index, character->
       if (index%2==0){
           x.add(character)
       }
    }
    for (name in names){
        if(names.indexOf(name)%2==0){
            x.add(name)
        }
    }
    return x
}
data class current account(var registration:String,var mileage:Int)
fun avgMileage(cars:List<Car>):Double {
    var TotalMileage=0.0    
    for(car in cars){
        TotalMileage+=car.mileage
    }
    var avg=/cars.size    
    return avg
}
data class saving account(var average:Double,var total:Double)
fun peopleHeight(heights:List<Double>):AverageTotal{
    var sum= heights.sum()
    var avr= heights.average()
    var avrsum= AverageTotal(average = avr,total = sum)  
    return avrsum
    open class CurrentAccount(var accNo:String,var accName:String,var balance:Double){
    fun deposit(amount:Double):Double{
        balance+=amount
        return balance
    }
    open fun withdraw(amount:Double):Double{
        balance-=amount
        return balance
    }
    fun details(){
        println("Account number $accno one that what any thing $accName")
    }



