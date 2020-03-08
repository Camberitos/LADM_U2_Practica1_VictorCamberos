package mx.edu.ittepic.ladm_u2_practica1_victorcamberos

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.widget.ImageView
import android.graphics.BitmapFactory
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class Lienzo(p:MainActivity) : View(p){
    var puntero = p
    var cy = -10f
    var cx = 100f
    var copo1 = FiguraGeometrica(200, -50, 10)
    var copo2 = FiguraGeometrica(100,-10,10)
    var copo3 = FiguraGeometrica(400,-20,10)
    var copo4 = FiguraGeometrica(550,-80,10)
    var copo5 = FiguraGeometrica(850,-70,10)
    var copo6 = FiguraGeometrica(750,-100,10)
    var copo7 = FiguraGeometrica(1000,-89,10)
    var copo11 = FiguraGeometrica(220, -300, 10)
    var copo22 = FiguraGeometrica(130,-250,10)
    var copo33 = FiguraGeometrica(420,-350,10)
    var copo44 = FiguraGeometrica(575,-230,10)
    var copo55 = FiguraGeometrica(855,-220,10)
    var copo66 = FiguraGeometrica(760,-310,10)
    var copo77 = FiguraGeometrica(950,-279,10)
    var copo111 = FiguraGeometrica(210, -500, 10)
    var copo222 = FiguraGeometrica(120,-600,10)
    var copo333 = FiguraGeometrica(410,-480,10)
    var copo444 = FiguraGeometrica(555,-460,10)
    var copo555 = FiguraGeometrica(845,-520,10)
    var copo666 = FiguraGeometrica(750,-550,10)
    var copo777 = FiguraGeometrica(1000,-429,10)
    var copo1111 = FiguraGeometrica(230, -700, 10)
    var copo2222 = FiguraGeometrica(140,-850,10)
    var copo3333 = FiguraGeometrica(440,-750,10)
    var copo4444 = FiguraGeometrica(585,-930,10)
    var copo5555 = FiguraGeometrica(895,-820,10)
    var copo6666 = FiguraGeometrica(730,-870,10)
    var copo7777 = FiguraGeometrica(990,-919,10)
    var copo11111 = FiguraGeometrica(210, -850, 10)
    var copo22222 = FiguraGeometrica(120,-1000,10)
    var copo33333 = FiguraGeometrica(420,-900,10)
    var copo44444 = FiguraGeometrica(565,-1080,10)
    var copo55555 = FiguraGeometrica(875,-970,10)
    var copo66666 = FiguraGeometrica(710,-1020,10)
    var copo77777 = FiguraGeometrica(970,-1069,10)

    var sol = FiguraGeometrica(1000, 110, 200)
    var nube1 = FiguraGeometrica(250,350,80)
    var nube2 = FiguraGeometrica(330,390,80)
    var nube3 = FiguraGeometrica(340,320,80)
    var nube4 = FiguraGeometrica(400,350,80)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        var paint = Paint()
        canvas.drawColor(Color.CYAN)


        //nube
        paint.color = Color.WHITE
        nube1.pintar(canvas,paint)
        nube2.pintar(canvas,paint)
        nube3.pintar(canvas,paint)
        nube4.pintar(canvas,paint)

        //sol
        paint.color = Color.YELLOW
        sol.pintar(canvas,paint)


        //suelo
        paint.color = Color.GREEN
        paint.style = Paint.Style.FILL
        canvas.drawRect(0f, 1600f, 1100f, 2200f, paint)
        paint.color = Color.GREEN
        canvas.drawRect(0f, 1600f, 1000f, 2200f, paint)
        //arbol
        paint.color = Color.rgb(180,137,6)
        canvas.drawRect(200f, 1500f, 250f, 1700f, paint)
        paint.color = Color.rgb(23,180,6)
        canvas.drawCircle(220f, 1500f, 80f, paint)
        paint.color = Color.rgb(23,180,6)
        canvas.drawCircle(220f, 1400f, 80f, paint)
        //casa
        paint.color = Color.rgb(170,130,32)
        canvas.drawRect(470f, 1400f, 870f, 1700f, paint)
        paint.color = Color.DKGRAY
        canvas.drawRect(625f, 1530f, 705f, 1700f, paint)
        paint.color = Color.WHITE
        canvas.drawCircle(550f, 1520f, 40f, paint)

        var imagen = BitmapFactory.decodeResource(resources,R.drawable.techo)
        canvas.drawBitmap(imagen,370f,1110f,paint)

        paint.color = Color.WHITE
        copo1.pintar(canvas,paint)
        copo2.pintar(canvas,paint)
        copo3.pintar(canvas,paint)
        copo4.pintar(canvas,paint)
        copo5.pintar(canvas,paint)
        copo6.pintar(canvas,paint)
        copo7.pintar(canvas,paint)
        copo11.pintar(canvas,paint)
        copo22.pintar(canvas,paint)
        copo33.pintar(canvas,paint)
        copo44.pintar(canvas,paint)
        copo55.pintar(canvas,paint)
        copo66.pintar(canvas,paint)
        copo77.pintar(canvas,paint)
        copo111.pintar(canvas,paint)
        copo222.pintar(canvas,paint)
        copo333.pintar(canvas,paint)
        copo444.pintar(canvas,paint)
        copo555.pintar(canvas,paint)
        copo666.pintar(canvas,paint)
        copo777.pintar(canvas,paint)
        copo1111.pintar(canvas,paint)
        copo2222.pintar(canvas,paint)
        copo3333.pintar(canvas,paint)
        copo4444.pintar(canvas,paint)
        copo5555.pintar(canvas,paint)
        copo6666.pintar(canvas,paint)
        copo7777.pintar(canvas,paint)
        copo11111.pintar(canvas,paint)
        copo22222.pintar(canvas,paint)
        copo33333.pintar(canvas,paint)
        copo44444.pintar(canvas,paint)
        copo55555.pintar(canvas,paint)
        copo66666.pintar(canvas,paint)
        copo77777.pintar(canvas,paint)

    }
    fun limpiar(){
        sol.mover()
        nube1.mover()
        nube2.mover()
        nube3.mover()
        nube4.mover()
    }

    fun animarCopos() {
        copo1.nevar()
        copo2.nevar()
        copo3.nevar()
        copo4.nevar()
        copo5.nevar()
        copo6.nevar()
        copo7.nevar()
        copo11.nevar()
        copo22.nevar()
        copo33.nevar()
        copo44.nevar()
        copo55.nevar()
        copo66.nevar()
        copo77.nevar()
        copo111.nevar()
        copo222.nevar()
        copo333.nevar()
        copo444.nevar()
        copo555.nevar()
        copo666.nevar()
        copo777.nevar()
        copo1111.nevar()
        copo2222.nevar()
        copo3333.nevar()
        copo4444.nevar()
        copo5555.nevar()
        copo6666.nevar()
        copo7777.nevar()
        copo11111.nevar()
        copo22222.nevar()
        copo33333.nevar()
        copo44444.nevar()
        copo55555.nevar()
        copo66666.nevar()
        copo77777.nevar()
        invalidate()
    }
}

