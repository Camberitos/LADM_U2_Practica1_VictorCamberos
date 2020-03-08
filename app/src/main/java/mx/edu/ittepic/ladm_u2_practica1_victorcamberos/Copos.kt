package mx.edu.ittepic.ladm_u2_practica1_victorcamberos

class HiloCopos (p:MainActivity):Thread(){
    var puntero = p
    override fun run() {
        super.run()
        sleep(5000)
        puntero.miLienzo!!.limpiar()
        while(true){
            sleep(30)
            puntero.runOnUiThread {
                puntero.miLienzo!!.animarCopos()
            }
        }

    }
}