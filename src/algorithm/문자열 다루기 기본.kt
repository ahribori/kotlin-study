package algorithm

class Solution3 {
    fun solution(s: String): Boolean {
        if (s.length != 4 && s.length != 6) {
          return false
        }

        val hasAlphabet = s.filter { it.isDigit() }.length != s.length
        if (hasAlphabet) {
            return false
        }
        return true
    }
}

fun main() {
    print(Solution3().solution("a1234"))
    print(Solution3().solution("1234"))
}