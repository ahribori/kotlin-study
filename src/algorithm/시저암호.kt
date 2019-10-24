package algorithm

class Solution9 {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val alphabet = arrayOf('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
        s.toCharArray().forEach {
            val isUpperCase = it.isUpperCase()
            val idx = alphabet.indexOf(it.toLowerCase())
            val nextIdx = if (idx + n >= 25) 25 - idx + n - 1 else idx + n
            if (idx == -1) {
                answer += " "
            } else {
                answer += if (isUpperCase) alphabet[nextIdx].toUpperCase() else alphabet[nextIdx]
            }
        }
        return answer
    }
}

fun main() {
    val s = Solution9()
    println(s.solution("AB", 1))
    println(s.solution("z", 1))
    println(s.solution("a B z", 4))
}

