private val dp = Array(10001) { IntArray(4) }

fun main() {
    dp()

    repeat(readLine()!!.toInt()) {
        println(dp[readLine()!!.toInt()].sum())
    }
}

private fun dp() {
    dp[1][1] = 1
    dp[2][1] = 1; dp[2][2] = 1
    dp[3][1] = 1; dp[3][2] = 1; dp[3][3] = 1

    for(i in 4 .. 10000) {
        dp[i][1] = dp[i-1][1]
        dp[i][2] = dp[i-2][1] + dp[i-2][2]
        dp[i][3] = dp[i-3][1] + dp[i-3][2] + dp[i-3][3]
    }
}