package algorithm

class Solution4 {
    fun solution(seoul: Array<String>): String {
        return "김서방은 ${seoul.indexOf("Kim")}에 있다"
    }
}

fun main() {
    val seoul = arrayOf("Jane", "Kim")
    print(Solution4().solution(seoul))
}