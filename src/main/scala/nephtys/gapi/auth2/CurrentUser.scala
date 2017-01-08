package nephtys.gapi.auth2

import scala.scalajs.js

/**
  * Created by Christopher on 08.01.2017.
  */
@js.native
trait CurrentUser extends js.Object {
  def get: GoogleUser = js.native

  def listen(listener : js.Function1[GoogleUser, Unit]) : Unit = js.native
}