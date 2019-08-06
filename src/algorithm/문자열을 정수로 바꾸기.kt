package algorithm

import kotlin.math.pow

class Solution8 {
    fun solution(s: String): Int {
        var answer = 0
        val hasPrefix = s.startsWith("+") || s.startsWith("-")
        val isNegative = s.startsWith("-")
        answer = if (hasPrefix) {
            val withoutPrefix = Integer.parseInt(s.substring(1))
            if (isNegative) withoutPrefix * -1 else  withoutPrefix
        } else {
            Integer.parseInt(s)
        }
        return answer
    }
}

fun main() {
    val s = Solution8()
    println(s.solution("+1234"))
    println(s.solution("-1234"))
    println(s.solution("313"))
}

