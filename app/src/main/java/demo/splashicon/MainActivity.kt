package demo.splashicon

import android.app.Activity
import android.os.Bundle
import android.view.WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setDecorFitsSystemWindows(false)
        setContentView(R.layout.activity_main)
        window.insetsController?.setSystemBarsAppearance(APPEARANCE_LIGHT_STATUS_BARS,  APPEARANCE_LIGHT_STATUS_BARS)

        splashScreen.setOnExitAnimationListener { splashView ->
            // hold splash screen
            splashView.postDelayed({
                splashView.remove()
            }, 2000)
        }
    }
}