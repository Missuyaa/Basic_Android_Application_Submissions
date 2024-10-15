package com.dicoding.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.dicoding.myapplication.ui.theme.MyApplicationTheme
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.listOf as listOf1



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Setup Toolbar
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        // Temukan RecyclerView dari layout
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)


        // Data dummy untuk ditampilkan
        val articles = listOf1(
            Article(
                "Miaw Aug",
                "Reggie Prabowo Wongkar (lahir 13 Agustus 1988), yang lebih dikenal sebagai MiawAug, adalah seorang YouTuber dan kreator konten berkebangsaan Indonesia. Ia dikenal karena konten-kontennya yang berfokus pada permainan video yang dibuatnya. ",
                R.drawable.miaw_aug
            ),
            Article(
                "Windah Basudara",
                "Windah Basudara merupakan seorang YouTuber gaming yang dikenal sebagai idola para 'bocil kematian'. Nama Windah sudah tak asing lagi di kalangan pecinta game di Indonesia. Ia berhasil membangun karier yang sukses di dunia YouTube dengan konsistensi dan keahliannya dalam bermain game.Bernama lengkap Brando Franco Windah, Windah Basudara lahir pada tanggal 14 Maret 1992 di Manado. Ia berasal dari keluarga yang sederhana namun mendukungnya dalam mengejar impiannya. Sejak kecil, Windah sudah memiliki ketertarikan yang besar terhadap dunia game. Ia sering menghabiskan waktunya bermain game sejak masih duduk di bangku sekolah.Pada tahun 2013, Windah mulai membangun kanal YouTube-nya dengan konten gaming. Ia memulai dengan berbagi pengalaman dan tips bermain game yang berguna bagi para penontonnya. Melalui kesabaran dan kualitas kontennya, kanal YouTube Windah berhasil mendapatkan perhatian yang besar dari para penggemar game.Keahliannya dalam bermain game yang dilengkapi dengan komentar yang menghibur membuat video-videonya selalu dinanti oleh para penonton. Windah juga dikenal dengan kemampuannya dalam berkomunikasi dengan para penggemar melalui media sosial.Dengan semangat dan dedikasinya, Windah Basudara telah berhasil mencapai kesuksesan sebagai YouTuber gaming. Ia berhasil menginspirasi banyak orang untuk mengejar impian mereka dan membuktikan bahwa dengan kesabaran dan kerja keras, segala hal mungkin tercapai. Windah Basudara adalah salah satu nama yang patut diperhitungkan di industri game di Indonesia.",
                R.drawable.windah_basudara
            ),
            Article(
                "Afif Yulistian",
                "Afif Yulistian atau yang kerap disapa Apip adalah seorang youtuber dan gamer profesional. Nama Afif Yulistian dikenal sebagai pemain yang paling senior dalam game Minecraft sejak generasi pertama. Menjadi gamer awalnya merupakan keisengan Afif Yulistian lalu akhirnya menjadi sebuah profesi yang ditekuni. Pria berusia 29 tahun ini dibesarkan oleh single mother sejak masih duduk di bangku kelas lima sekolah dasar. Merupakan anak pertama dari tiga bersaudara yang menjadikannya mandiri sejak kecil. Meskipun sangat hobi bermain game Afif tidak melupakan pendidikannya.",
                R.drawable.afif_yulistian
            ),
            Article(
                "Yudist Ardhana",
                "Bali tak hanya dikenal karena pariwisatanya. Ada juga sosok Youtuber yang meraih sukses. Salah satunya adalah Yudist Ardhana. Pria kelahiran 13 Oktober 1987 di Denpasar, Bali ini memiliki dua gelar sarjana. Ia adalah lulusan dari Fakultas Desain jurusan Desain Komunikasi Visual Universitas Pelita Harapan Karawaci Tangerang (2011) dan Fakultas Hukum Universitas Warmadewa Denpasar (2016). Setelah lebih dari empat tahun Yudist Ardhana menjadi seorang Youtuber atau content creator, kini ia telah memiliki lebih dari 8 juta subscriber untuk kanal Youtubenya dan lebih dari 1 juta follower di akun Instagram miliknya. Singkat kata, pria yang kerap disapa Yudist ini telah banyak dikenal masyarakat dan telah menjadi salah satu Youtuber atau content creator tersukses di Pulau Dewata. Kanal Youtube milik Yudist saat ini mampu bersaing dengan kanal-kanal Youtuber nasional dan juga kanal milik para artis hingga kanal milik stasiun televisi di Youtube. Saat artikel ini ditulis kanal Youtube Yudist Ardhana menempati peringkat ke-25 di Indonesia. Hal ini tentunya menjadi sebuah kebanggaan tersendiri mengingat tidak banyak Youtuber atau content creator asal Bali yang sukses masuk di pentas nasional. Diketahui, pemilik akun Instagram @yudistardhana ini mengunggah berbagai konten menarik di kanal Youtubenya mulai dari sulap, prank, eksperimen, vlog, review, dan aneka video keseruan lainnya.",
                R.drawable.yudist_ardhana
            ),
            Article(
                "Turah Phartayana",
                "Turah Patharyana adalah seorang mahasiswa yang sedang menempuh pendidikan di Rusia. Turah Parthayana lahir pada tanggal 7 September 1997 ini adalah seorang mahasiswa yang berasal dari Pulau Dewata Bali. Turah adalah anak bungsu dari empat bersaudara. Berkat mendapatkan beasiswa, Turah Parthayana berhasil menempuh pendidikan di Tomsk State Univeristy Rusia dan mengambil jurusan Manajemen Bisnis. Ia semakin dikenal semenjak menjadi seorang content creator di Youtube yang menceritakan tentang kehidpannya sebagai mahasiswa di Rusia. Disela-sela waktunya selama menjadi mahasiswa di Rusia, Turah Parthayana juga sering membuat film-film pendek bersama teman-temannya. Hal tersebut karena Turah Parthayana ingin menjadi seorang sutradara ataupun ikut bermain dalam sebuah film.",
                R.drawable.turah_phartayana
            ),
            Article(
                "Jerome Polin",
                "Jerome lahir di Jakarta pada tanggal 2 Mei 1998. Ia merupakan putra kedua dari tiga bersaudara dari pasangan Marojahan Sintong Sijabat dan Chrissie Rahmeinsa. Ayah Jerome adalah seorang pendeta yang saat ini melayani di Gereja Kristen Indonesia Darmo Satelit Surabaya, sementara ibunya adalah seorang ibu rumah tangga.",
                R.drawable.jerome_polin
            ),
            Article(
                "Mr.Beast",
                "MrBeast yang berasal dari Amerika Serikat menjadi tenar karena aksi filantropinya di media sosial. Ia kerap melakukan donasi dengan nominal besar, di samping konten-kontennya yang lucu meski kerap terasa absurd. Sosoknya yang menyenangkan dan inspiratif membuat banyak orang mengidolakannya.",
                R.drawable.mr_beast
            ),
            Article(
                "Kai",
                "Pemuda kelahiran 16 Desember 2001 ini lahir dan besar di New York, Amerika Serikat. Kini, Kai Cenat diikuti 6,5 juta followers di platform streaming Twitch, tempat dirinya biasanya mengadakan live streaming. Kai Cenat juga cukup terkenal di YouTube, di mana ia memiliki lebih dari 4,1 juta juta subscriber. Kanal YouTube-nya memuat sejumlah unggahan tentang kesehariannya, vlog komedi, tantangan, hingga prank. Di YouTube, ia memiliki 299 video yang diunggah dengan total 276 juta views. Pada Desember 2022, Cenat dinobatkan sebagai streamer tahun ini di penghargaan Streamy tahun ke-12. Influencer Kai Cenat juga cukup tenar di TikTok, di mana ia memiliki 7,1 juta followers dengan puluhan jutaan jumlah views tiap video.",
                R.drawable.kai
            ),
            Article(
                "Fadil Jaidi",
                "Fadil Jaidi merupakan selebgram dan youtuber asal Indonesia yang merupakan keturunan arab. Fadil Lahir pada tanggal 17 Oktober 1994. Ia merupakan anak kedua dari 3 bersaudara, Dilla Jaidi dan Yislam Jaidi. Fadil Jaidi juga dikenal banyak orang karena kontennya bersama sang Ayah yaitu Pak Muh yang mengundang banyak gelak tawa dan beberapa prank yang ia jadikan konten youtubenya. Ia juga merupakan salah satu selebgram terkenal dengan jumlah followers instagram sebanyak 4,2 juta followers. ",
                R.drawable.fadil_jaidi
            ),
            Article(
                "Fiki Naki",
                "Fiki Naki adalah anak laki-laki dari pasangan Seny Patra yang berasal dari Solok, dan Eva Rahayu dari Padang. Asli dari Sumatera Barat, Fiki Naki merupakan anak ketiga dari lima bersaudara. Orangtuanya pergi merantau ke Pekalongan, sehingga lahirlah Fiki Naki di sana.",
                R.drawable.fiki_naki
            ),


            // Tambahkan lebih banyak artikel
        )

        // Setup adapter dan pasangkan dengan RecyclerView
        val adapter = ArticleAdapter(articles) { article ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("EXTRA_TITLE", article.title)
                putExtra("EXTRA_IMAGE", article.imageResId)
                putExtra("EXTRA_DESCRIPTION", article.overview)
            }
            startActivity(intent)
        }

        recyclerView.adapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return when (item.itemId) {
//
//            R.id.about_page -> {
//                val intent = Intent(this, AboutActivity::class.java)
//                startActivity(intent)
//                true
//            }
//            else -> super.onOptionsItemSelected(item)
//        }
//    }
//}
