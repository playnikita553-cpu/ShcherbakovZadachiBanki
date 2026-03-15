//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
println("Введите стоимость книг, а затем введите сумму имеющихся денег")
    var pricek = readln().toInt()
    var dengy = readln().toInt()
    var itog: Int = 0
    if(pricek == dengy)
    {
        println("Спасибо за покупку")
    }
    if(pricek < dengy)
    {
        print("сдача- ")
        print(dengy - pricek)

    }
    if(pricek > dengy)
    {
        print("Недостаточно средств, необходимо еще внести - ")
        print(pricek - dengy)
    }


}
