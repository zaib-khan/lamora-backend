package controllers

import javax.inject.*
import play.api.mvc.*

@Singleton
final class HealthController @Inject() (
                                         cc: ControllerComponents
                                       ) extends AbstractController(cc):

  def health: Action[AnyContent] = Action:
    Ok("Lamora backend is running")