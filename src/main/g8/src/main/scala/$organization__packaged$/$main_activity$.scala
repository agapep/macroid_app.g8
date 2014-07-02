package $organization$

import android.app.Activity
import android.os.Bundle
import android.view.Menu

import macroid.Contexts 
import macroid.contrib.Layouts.VerticalLinearLayout
import macroid.FullDsl._

class $main_activity$ extends Activity with Contexts[Activity] {
	
  lazy val layout = l[VerticalLinearLayout](
    w[TextView] <~ text("Hello Funny Guy!!! I'm your phone.")
  )
	
  override def onCreate(bundle: Bundle) = {
    super.onCreate(bundle)
    setContentView(getUi(layout))
  }
	
  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater.inflate(R.menu.main, menu)
    true
  }
}
