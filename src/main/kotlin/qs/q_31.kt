@DslMarker
annotation class HtmlDsl
/**
Q31: Build a small DSL for building HTML. Create classes HTML, Body, and Paragraph, and implement a function that constructs an HTML structure using a Kotlin DSL style.
 */
class q_31 {
    init {
        println("q_31 called.\na small HTML structure:")
        println(
            
        html {
            body {
                p("This is a paragraph inside the body.")
                p("Another paragraph inside.")
            }
        }
            
            
        .render())
    }
}

@HtmlDsl
class HTML {
    private val body = Body()

    fun body(init: Body.() -> Unit) {
        body.apply(init)
    }

    fun render(): String {
        return "<html>\n${body.render()}\n</html>"
    }
}

@HtmlDsl
class Body {
    private val paragraphs = mutableListOf<Paragraph>()

    fun p(text: String) {
        paragraphs.add(Paragraph(text))
    }

    fun render(): String {
        return "  <body>\n" + paragraphs.joinToString("\n") { it.render() } + "\n  </body>"
    }
}

@HtmlDsl
class Paragraph(private val text: String) {
    fun render(): String {
        return "    <p>$text</p>"
    }
}

fun html(init: HTML.() -> Unit): HTML = HTML().apply(init)
