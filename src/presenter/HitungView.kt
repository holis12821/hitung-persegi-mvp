package presenter

import model.Segitiga

interface HitungView {
    fun onSuccess() : Boolean
    fun onError() : Boolean
    fun hasil(hasil : Segitiga)
}