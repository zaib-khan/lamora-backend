package lamora

case object AsciiBanner {
  val banner: String =
    """
      |██╗      █████╗ ███╗   ███╗ ██████╗ ██████╗  █████╗
      |██║     ██╔══██╗████╗ ████║██╔═══██╗██╔══██╗██╔══██╗
      |██║     ███████║██╔████╔██║██║   ██║██████╔╝███████║
      |██║     ██╔══██║██║╚██╔╝██║██║   ██║██╔══██╗██╔══██║
      |███████╗██║  ██║██║ ╚═╝ ██║╚██████╔╝██║  ██║██║  ██║
      |╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝
      |
      |""".stripMargin

  val Purple      = "\u001b[38;2;168;85;247m"
  val PurpleDark  = "\u001b[38;2;124;58;237m"
  val Cyan        = "\u001b[38;2;56;189;248m"
  val Green       = "\u001b[38;2;34;197;94m"
  val Gray        = "\u001b[38;2;156;163;175m"
  val White       = "\u001b[38;2;243;244;246m"
  val Black       = "\u001b[48;2;0;0;0m"
  val letterColor = Green
  val shadowColor   = Cyan

  val bannerColor: String =
    s"""
       |${letterColor}██${shadowColor}╗      ${letterColor}█████${shadowColor}╗ ${letterColor}███${shadowColor}╗   ${letterColor}███${shadowColor}╗ ${letterColor}██████${shadowColor}╗ ${letterColor}██████${shadowColor}╗  ${letterColor}█████${shadowColor}╗
       |${letterColor}██${shadowColor}║     ${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}╗${letterColor}████${shadowColor}╗ ${letterColor}████${shadowColor}║${letterColor}██${shadowColor}╔═══${letterColor}██${shadowColor}╗${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}╗${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}╗
       |${letterColor}██${shadowColor}║     ${letterColor}███████${shadowColor}║${letterColor}██${shadowColor}╔${letterColor}████${shadowColor}╔${letterColor}██${shadowColor}║${letterColor}██${shadowColor}║   ${letterColor}██${shadowColor}║${letterColor}██████${shadowColor}╔╝${letterColor}███████${shadowColor}║
       |${letterColor}██${shadowColor}║     ${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}║${letterColor}██${shadowColor}║╚${letterColor}██${shadowColor}╔╝${letterColor}██${shadowColor}║${letterColor}██${shadowColor}║   ${letterColor}██${shadowColor}║${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}╗${letterColor}██${shadowColor}╔══${letterColor}██${shadowColor}║
       |${letterColor}███████${shadowColor}╗${letterColor}██${shadowColor}║  ${letterColor}██${shadowColor}║${letterColor}██${shadowColor}║ ${shadowColor}╚═╝ ${letterColor}██${shadowColor}║╚${letterColor}██████${shadowColor}╔╝${letterColor}██${shadowColor}║  ${letterColor}██${shadowColor}║${letterColor}██${shadowColor}║  ${letterColor}██${shadowColor}║
       |${shadowColor}╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝
       |
       |${Gray}Version :${White} ${Cyan}0.1.0${White}
       |${Gray}Stack   :${White} ${Cyan}Scala 3${White} • ${Cyan}ZIO${White} • ${Cyan}ZIO HTTP${White}
       |
       |${Green}✓${White} Lamora backend starting...
       |""".stripMargin

}
