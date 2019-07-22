package algorithm

class Solution2 {
    fun solution(s: String): String {
        return s.toCharArray()
            .sortedWith(Comparator { a, b -> b - a })
            .joinToString("")
    }
}

fun main() {
    val s = Solution2()
    val result = s.solution("Zbcdefg")
    print(result)
}

