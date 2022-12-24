package scripting

fun main() {
    val sample = "113+1"
    Jsr().testCompile(sample, shouldCompile = true)
}
