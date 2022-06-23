package id.co.rizki.binarch6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import id.co.rizki.binarch6.databinding.ActivityMainBinding
import id.co.rizki.binarch6.model.StoreItem

class MainActivity : AppCompatActivity() {

    //step 2 untuk viewbinding, deklarasikan variable berdasarkan xml
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // step 3 untuk viewbinding, bind xml ke variable
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //step 4 implement recyclerview, set adapter ke recyclerview dan set layoutmanager
        binding.rvList.adapter = ListAdapter(getDummyData())
        binding.rvList.layoutManager = LinearLayoutManager(this)

    }

    private fun getDummyData() : ArrayList<StoreItem> {
        return arrayListOf(
            StoreItem("Suit Game", "Juna Inc", "Games", "4.7","https://play-lh.googleusercontent.com/H_l_WkvDPCZiCtez3-0sEJ9aOqXdYN3qP7-SGtuvoh9t6SqdlKTYZoD1EmqqaFNUzqIc=s48-rw"),
            StoreItem("Binar Academy", "Binar", "Education", "4.9","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Binar App", "Binar", "Education", "4.6","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Instagram", "Facebook", "Social Media", "4.3","https://play-lh.googleusercontent.com/9RDn3svJQD6yLR19uAJl_KeoqZDXbykuC5jcPKQb127YI-v8i3SIDkj9kHLVYtLeqQ=w240-h480-rw"),
            StoreItem("Youtube", "Google", "Entertainment", "4.9","https://play-lh.googleusercontent.com/lMoItBgdPPVDJsNOVtP26EKHePkwBg-PkuY9NOrc-fumRtTFP4XhpUNk_22syN4Datc=s48-rw"),
            StoreItem("Suit Game", "Juna Inc", "Games", "4.7","https://play-lh.googleusercontent.com/H_l_WkvDPCZiCtez3-0sEJ9aOqXdYN3qP7-SGtuvoh9t6SqdlKTYZoD1EmqqaFNUzqIc=s48-rw"),
            StoreItem("Binar Academy", "Binar", "Education", "4.9","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Binar App", "Binar", "Education", "4.6","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Instagram", "Facebook", "Social Media", "4.3","https://play-lh.googleusercontent.com/9RDn3svJQD6yLR19uAJl_KeoqZDXbykuC5jcPKQb127YI-v8i3SIDkj9kHLVYtLeqQ=w240-h480-rw"),
            StoreItem("Youtube", "Google", "Entertainment", "4.9","https://play-lh.googleusercontent.com/lMoItBgdPPVDJsNOVtP26EKHePkwBg-PkuY9NOrc-fumRtTFP4XhpUNk_22syN4Datc=s48-rw"),
            StoreItem("Suit Game", "Juna Inc", "Games", "4.7","https://play-lh.googleusercontent.com/H_l_WkvDPCZiCtez3-0sEJ9aOqXdYN3qP7-SGtuvoh9t6SqdlKTYZoD1EmqqaFNUzqIc=s48-rw"),
            StoreItem("Binar Academy", "Binar", "Education", "4.9","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Binar App", "Binar", "Education", "4.6","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Instagram", "Facebook", "Social Media", "4.3","https://play-lh.googleusercontent.com/9RDn3svJQD6yLR19uAJl_KeoqZDXbykuC5jcPKQb127YI-v8i3SIDkj9kHLVYtLeqQ=w240-h480-rw"),
            StoreItem("Youtube", "Google", "Entertainment", "4.9","https://play-lh.googleusercontent.com/lMoItBgdPPVDJsNOVtP26EKHePkwBg-PkuY9NOrc-fumRtTFP4XhpUNk_22syN4Datc=s48-rw"),
            StoreItem("Suit Game", "Juna Inc", "Games", "4.7","https://play-lh.googleusercontent.com/H_l_WkvDPCZiCtez3-0sEJ9aOqXdYN3qP7-SGtuvoh9t6SqdlKTYZoD1EmqqaFNUzqIc=s48-rw"),
            StoreItem("Binar Academy", "Binar", "Education", "4.9","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Binar App", "Binar", "Education", "4.6","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Instagram", "Facebook", "Social Media", "4.3","https://play-lh.googleusercontent.com/9RDn3svJQD6yLR19uAJl_KeoqZDXbykuC5jcPKQb127YI-v8i3SIDkj9kHLVYtLeqQ=w240-h480-rw"),
            StoreItem("Youtube", "Google", "Entertainment", "4.9","https://play-lh.googleusercontent.com/lMoItBgdPPVDJsNOVtP26EKHePkwBg-PkuY9NOrc-fumRtTFP4XhpUNk_22syN4Datc=s48-rw"),
            StoreItem("Suit Game", "Juna Inc", "Games", "4.7","https://play-lh.googleusercontent.com/H_l_WkvDPCZiCtez3-0sEJ9aOqXdYN3qP7-SGtuvoh9t6SqdlKTYZoD1EmqqaFNUzqIc=s48-rw"),
            StoreItem("Binar Academy", "Binar", "Education", "4.9","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Binar App", "Binar", "Education", "4.6","https://play-lh.googleusercontent.com/v8u-iwcZoRitxks63jAmjTVWFH55P-hlbMOPGzaojppiwz6blGIAx0gfGYzjjmnifvc=w240-h480-rw"),
            StoreItem("Instagram", "Facebook", "Social Media", "4.3","https://play-lh.googleusercontent.com/9RDn3svJQD6yLR19uAJl_KeoqZDXbykuC5jcPKQb127YI-v8i3SIDkj9kHLVYtLeqQ=w240-h480-rw"),
            StoreItem("Youtube", "Google", "Entertainment", "4.9","https://play-lh.googleusercontent.com/lMoItBgdPPVDJsNOVtP26EKHePkwBg-PkuY9NOrc-fumRtTFP4XhpUNk_22syN4Datc=s48-rw"),
        )
    }
}