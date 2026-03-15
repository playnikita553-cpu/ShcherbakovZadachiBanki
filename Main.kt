//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    do
    {
        println("Меню:")
        println("1.Первое блюдо")
        println("2.Второе блюдо")
        println("3.Десерт")
        println("Пожалуйста выберите пункт меню: ")
        var punct = readln().toInt()
        when (punct) {
            1 -> println("Борщ")
            2 -> println("картошка с мясом")
            3 -> println("Компот")


        }
        println("Если хотите продолжить программу введите: 5")
        var chetchik = readln().toInt()
    }while(chetchik == 5)


}