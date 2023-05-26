
import link.kotlin.scripts.dsl.Article
import link.kotlin.scripts.dsl.LinkType.*
import link.kotlin.scripts.dsl.LanguageCodes.*
import java.time.LocalDate

// language=Markdown
val body = """

[Fun with Kotlin](https://vimeo.com/151846078)

"""

Article(
  title = "Fun with Kotlin",
  url = "https://vimeo.com/151846078",
  categories = listOf(
    "Kotlin"
  ),
  type = video,
  lang = EN,
  author = "Eder Bastos",
  date = LocalDate.of(2016, 1, 14),
  body = body
)
