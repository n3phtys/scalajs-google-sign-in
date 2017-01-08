package nephtys.gapi.auth2

import scala.scalajs.js

/**
  * Created by Christopher on 08.01.2017.
  */
@js.native
trait IsSignedIn extends js.Object{
  def get(): Boolean = js.native

  def listen(listener: js.Function1[Boolean, Unit]): Unit = js.native
}
