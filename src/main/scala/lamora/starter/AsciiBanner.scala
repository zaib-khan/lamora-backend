package lamora.starter

import Colors.*
import scala.util.Random
import zio.{UIO, ZIO}

case object AsciiBanner {
  private val bannersColorCombination: Seq[BannersColorCombination] = Seq(
    BannersColorCombination(whiteSoft, purple),
    BannersColorCombination(lavender, purpleDark),
    BannersColorCombination(white, cyan),
    BannersColorCombination(amber, rose),
    BannersColorCombination(pink, violet),
    BannersColorCombination(cyanIce, blue),
    BannersColorCombination(goldLight, gold),
    BannersColorCombination(grayLight, gray),
    BannersColorCombination(green, cyan)
  )

  private def randomBannerColorCombination: BannersColorCombination =
    bannersColorCombination(Random.nextInt(bannersColorCombination.size))

  private def obtainBanner(main: String, secondary: String): String =
    s"""
       |${main}██${secondary}╗      ${main}█████${secondary}╗ ${main}███${secondary}╗   ${main}███${secondary}╗ ${main}██████${secondary}╗ ${main}██████${secondary}╗  ${main}█████${secondary}╗
       |${main}██${secondary}║     ${main}██${secondary}╔══${main}██${secondary}╗${main}████${secondary}╗ ${main}████${secondary}║${main}██${secondary}╔═══${main}██${secondary}╗${main}██${secondary}╔══${main}██${secondary}╗${main}██${secondary}╔══${main}██${secondary}╗
       |${main}██${secondary}║     ${main}███████${secondary}║${main}██${secondary}╔${main}████${secondary}╔${main}██${secondary}║${main}██${secondary}║   ${main}██${secondary}║${main}██████${secondary}╔╝${main}███████${secondary}║
       |${main}██${secondary}║     ${main}██${secondary}╔══${main}██${secondary}║${main}██${secondary}║╚${main}██${secondary}╔╝${main}██${secondary}║${main}██${secondary}║   ${main}██${secondary}║${main}██${secondary}╔══${main}██${secondary}╗${main}██${secondary}╔══${main}██${secondary}║
       |${main}███████${secondary}╗${main}██${secondary}║  ${main}██${secondary}║${main}██${secondary}║ ${secondary}╚═╝ ${main}██${secondary}║╚${main}██████${secondary}╔╝${main}██${secondary}║  ${main}██${secondary}║${main}██${secondary}║  ${main}██${secondary}║
       |${secondary}╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝${reset}
       |
       |${gray}Version :${white} ${cyan}0.1.0${white}
       |${gray}Stack   :${white} ${cyan}Scala 3${white} • ${cyan}ZIO${white} • ${cyan}ZIO HTTP${white}
       |
       |${green}✓${white} Lamora backend starting...
       |""".stripMargin

  def displayAllBanners: UIO[Unit] = {
    ZIO.foreachDiscard(bannersColorCombination) { combination =>
      ZIO.succeed {
        println(obtainBanner(combination.main, combination.secondary))
      }
    }
  }

  def displayRandomBanner: UIO[Unit] =
    ZIO.succeed {
      val combination = randomBannerColorCombination
      println(obtainBanner(combination.main, combination.secondary))
    }

}
