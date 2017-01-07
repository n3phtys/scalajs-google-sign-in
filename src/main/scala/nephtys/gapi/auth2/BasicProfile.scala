package nephtys.gapi.auth2

import scala.scalajs.js

/**
  * Created by Christopher on 07.01.2017.
  */
@js.native
trait BasicProfile extends js.Object {

  def getId() : String = js.native

  def getName() : String = js.native

  def getGivenName() : String = js.native

  def getFamilyName() : String = js.native

  def getImageUrl() : String = js.native

  def getEmail() : String = js.native
}
