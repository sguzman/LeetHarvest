package com.github.sguzman.scala.leet

case class Config(title: String = "LeetHarvest") extends scopt.OptionParser[Args](title) {
  head(title, "1.0")

  opt[String]('u', "cookie")
    .text("COOKIE")
    .required()
    .valueName("<cookie>")
    .minOccurs(1)
    .maxOccurs(1)
    .action((x, c) => c.copy(cookie = x))

  help("help")
    .text("this menu")
}