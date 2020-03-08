package mx.edu.ittepic.ladm_u2_practica1_victorcamberos

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    var miLienzo : Lienzo ?= null //declara objeto global en NULL
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        miLienzo = Lienzo(this) //entonces cambiamos Lienzo (p: this) por miLienzo en setContentView
        setContentView(miLienzo)
        HiloCopos(this).start()
    }
}
