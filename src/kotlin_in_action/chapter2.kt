package kotlin_in_action

fun main(args: Array<String>) {
    val maxNumber = max(2, 5)
    println(maxNumber)
    handleString()
}

// 코틀린 함수
fun max (a: Int, b: Int): Int {
    return if (a > b) a else b // 코틀린에서는 if가 문이 아니고 식이다
}

// 위의 함수를 더 간결하게 표현할 수 있음
// 함수의 리턴 타입을 지정하지 않아도 타입 추론이 됨 (어차피 Int 일테니까)
fun max2 (a: Int, b:Int) = if (a > b) a else b


fun handleValues() {
    val a = 3; // immutable (javascript의 const)
    var b = 3; // mutable (javascript의 let)
    // 가급적이면 immutable 변수를 선호하는 것이 좋다.

    val c = arrayListOf<String>("Java", "Kotlin")
    c[0] = "Javascript" // val로 선언했어도 object 내부는 immutable이 아님을 주의하자
}

fun handleString() {
    val name = "Daniel"
    println("Hello, $name!") // Hello, Daniel!
}


class Person(val name: String) // 코틀린의 VO 클래스 선언
