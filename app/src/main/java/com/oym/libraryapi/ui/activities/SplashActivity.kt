package com.oym.libraryapi.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.oym.libraryapi.R
import com.oym.libraryapi.ui.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        splashScreen.setOnExitAnimationListener{ splashScreenView ->
            splashScreenView.remove()

            //Iniciando la actividad principal
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}