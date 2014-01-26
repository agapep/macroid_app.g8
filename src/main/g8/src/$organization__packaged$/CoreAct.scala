package $organization$

import android.app.Activity
import android.os.Bundle

class CoreAct extends Activity {
  override def onCreate(bundle: Bundle) = {
    super.onCreate(bundle)

    setContentView(R.layout.main)
  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    getMenuInflater.inflate(R.menu.main, menu)
    true
  }
}