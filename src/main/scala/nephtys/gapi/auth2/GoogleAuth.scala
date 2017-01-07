package nephtys.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by Christopher on 07.01.2017.
  */
@JSName("gapi.auth2.getAuthInstance()")
@js.native
object GoogleAuth extends js.Object {

  @js.native
  object currentUser extends js.Object {
    def get: GoogleUser = js.native

    def listen(listener : js.Function1[GoogleUser, Unit]) : Unit = js.native
  }

  @js.native
  object isSignedIn extends js.Object {
    def get(): Boolean = js.native

    def listen(listener: js.Function1[Boolean, Unit]): Unit = js.native
  }

  def signIn(): js.Promise[js.Any] = js.native

  def signIn(options: js.Object): js.Promise[js.Any] = js.native

  def signOut(): js.Promise[js.Any] = js.native

  def disconnect(): Unit = js.native

  def grantOfflineAccess(options: js.Object): js.Promise[js.Any] = js.native

  def attackclickHandler(container: js.Any, options: js.Object, onsuccess: js.Function1[js.Any, Unit], onfailure: js.Function1[js.Any, Unit]): Unit = js.native
}
