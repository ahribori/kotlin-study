package algorithm

class Solution {
    fun solution1(strings: Array<String>, n: Int): Array<String> {
        strings.sortWith(Comparator { a, b ->
            if (a[n] > b[n]) 1 else if (a[n] == b[n]) if (a > b) 1 else -1 else -1;
        })
        return strings
    }

    fun solution2(strings: Array<String>, n: Int): Array<String> {
        strings.sortWith(Comparator { a, b ->
            when {
                a[n] > b[n] -> 1
                a[n] == b[n] -> {
                    when {
                        a > b -> 1
                        else -> -1
                    }
                }
                else -> -1
            }
        })
        return strings
    }
}

fun main() {
    val s = Solution();
    s.solution1(arrayOf("sun", "bed", "car"), 1)
    s.solution1(arrayOf("abce", "abcd", "cdx"), 2)
    s.solution2(arrayOf("sun", "bed", "car"), 1)
    s.solution2(arrayOf("abce", "abcd", "cdx"), 2)
}

