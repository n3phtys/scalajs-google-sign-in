package nephtys.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

/**
  * Created by Christopher on 07.01.2017.
  */
@js.native
trait GoogleAuth extends js.Object {


  val currentUser : CurrentUser = js.native



  val isSignedIn : IsSignedIn = js.native

  def signIn(): js.Promise[js.Any] = js.native

  def signIn(options: js.Object): js.Promise[js.Any] = js.native

  def signOut(): js.Promise[js.Any] = js.native

  def disconnect(): Unit = js.native

  def grantOfflineAccess(options: js.Object): js.Promise[js.Any] = js.native

  def attackclickHandler(container: js.Any, options: js.Object, onsuccess: js.Function1[js.Any, Unit], onfailure: js.Function1[js.Any, Unit]): Unit = js.native
}
