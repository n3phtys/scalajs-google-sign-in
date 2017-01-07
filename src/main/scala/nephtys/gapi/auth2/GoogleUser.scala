package nephtys.gapi.auth2

import scala.scalajs.js

/**
  * Created by Christopher on 07.01.2017.
  */
@js.native
trait GoogleUser {
  def getId() : String = js.native
  def isSignedIn() : Boolean = js.native
  def getGrantedScopes() : String = js.native
  def getBasicProfile() : BasicProfile = js.native
  def getAuthResponse : AuthResponse = js.native
  def reloadAuthResponse : js.Promise[AuthResponse] = js.native
  def hasGrantedScopes(scopes : String) : Boolean = js.native
  //TODO: def grant(options)
  //TODO: def grantOfflineAccess(scopes)
  def disconnect() : Unit = js.native
}
