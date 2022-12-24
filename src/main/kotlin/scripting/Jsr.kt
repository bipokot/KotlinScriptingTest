package scripting

import org.intellij.lang.annotations.Language
import javax.script.ScriptEngineManager

class Jsr {

    val engine = ScriptEngineManager().getEngineByExtension("kts")!!
//    var engine = KotlinJsr223DefaultScriptEngineFactory().scriptEngine

    fun testCompile(@Language("kotlin") contents: String, shouldCompile: Boolean) {
        try {
            println("RESULT: " + engine.eval(contents))
        } catch (e: Exception) {
            if (shouldCompile) throw e else return
        }
    }
}
