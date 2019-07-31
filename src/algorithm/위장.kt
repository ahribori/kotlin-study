package algorithm

class Solution6 {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val closet: MutableMap<String, Int> = emptyMap<String, Int>().toMutableMap()
        clothes.forEach {
            val type = it[1]
            if (!closet.containsKey(type)) {
                closet[type] = 1
            } else {
                closet[type] = closet[type]!!.plus(1)
            }
        }
        closet.forEach { t, u -> answer *= u + 1 }
        return answer - 1
    }
}

fun main() {
    val s = Solution6()
    print(s.solution(arrayOf(arrayOf("yellow_hat", "headgear"), arrayOf("blue_sunglasses", "eyewear"), arrayOf("green_turban", "headgear"))))
}

