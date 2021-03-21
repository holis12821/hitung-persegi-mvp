package view

import model.Segitiga
import presenter.HitungPresenter
import presenter.HitungView

class SegitigaView : HitungView {

    fun tampil(){
        val hitungPresenter = HitungPresenter(this)
        hitungPresenter.hitungSegitiga(12,11)
    }

    /*implement members*/
    override fun onSuccess(): Boolean {
        return true
    }

    override fun onError(): Boolean {
      return false
    }

    override fun hasil(hasil: Segitiga) {
        println("Hasil perhitungan : ${hasil.hasil}")
    }
}