package presenter

import model.Segitiga

class HitungPresenter ( private var view: HitungView) {

    companion object {
        const val s : Double = 0.5
    }
    fun hitungSegitiga(
            alas : Int,
            tinggi : Int
    ) {
        if (view.onSuccess()){
            val total  = s * (alas * tinggi)
            /*meletakkan hasil logic presenter ke model*/
            val segitiga = Segitiga()
            segitiga.hasil = total
            /*memasukan model ke dalam value parameter method abstract
             yang digunakan sebagai jembatan antara model dengan view agar hasilnya
             bisa ditambilkan di view*/
            /*jadi cukup bawa objekya saja untuk mengakses data hasil perhitungan yg sudah dihitung */

            view.hasil(segitiga)
        } else if (view.onError()){
            println("Gagal melakukan proses perhitungan")
        }
    }
}