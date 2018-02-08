package com.project.dwidianayu.resepkueku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    TextView judul;
    TextView deskripsi;
    TextView bahan;
    TextView procedure;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.gambar2);
        judul = (TextView)findViewById(R.id.judul2);
        deskripsi = (TextView)findViewById(R.id.deskripsi);
        bahan = (TextView)findViewById(R.id.bahan);
        procedure = (TextView)findViewById(R.id.carapembuatan);

        recyclerView = (RecyclerView)findViewById(R.id.recycleV);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        int[]image = {
                R.drawable.browniespandan,
                R.drawable.crispybanana,
                R.drawable.dadargulung,
                R.drawable.donatkentang,
                R.drawable.resepnastar};

        String[] judul = {
                "Brownies Pandan",
                "Crispy Banana",
                "Dadar Gulung",
                "Donat Kentang",
                "Nastar Keju"
        };

        String[] deskripsi = {
                "Pasti banyak yang sudah mencoba kelezatan Brownies Kukus Pandan. Ya, salah satu jenis kue basah berwarna hijau lembut ini memang banyak sekali yang menyukainya.",
                "Pisang goreng merupakan salah satu jenis gorengan yang digemari oleh masyarakat Indonesia. Nggak kebayang deh, gimana jadinya dunia ini tanpa gorengan, pasti terasa hampa, seperti hidupku tanpamu.",
                "Dadar gulung merupakan kuliner khas yang masuk dalam kategori jajanan pasar karena memang dari dulu sudah menjadi kudapan atau cemilan khas yang bisa ditemukan dengan mudah di pasar tradisional.",
                "Kue yang bisa dihiasi berbagai variasi toping ini sudah menjadi jajanan umum di Indonesia. Nah, resep kali ini juga merupakan resep yang sangat cocok jika dihidangkan saat bekumpul bersama keluarga/sahabat di hari libur.",
                "Nastar merupakan salah satu kue yang paling dicari saat bulan puasa dan lebaran. Mau membuatnya sendiri tapi tidak punya oven? Jangan khawatir. Langsung saja lihat resep mudahnya di bawah ini, tanpa oven."
        };

        String[] bahan = {
                "- Tepung Terigu 60 gram\n" +
                        "- Telur Ayam 3 butir\n" +
                        "- Pengembang kue kurang lebih seperempat sendok teh\n" +
                        "- Gula pasir 40 gram\n" +
                        "- Susu bubuk 10 gram\n" +
                        "- White coklat 50 gram\n" +
                        "- Pengembang kue seperempat sendok teh\n" +
                        "- Pasta Pandan seperempat sendok teh\n" +
                        "- Margarin 30 gram\n" +
                        "- Kertas roti untuk alas loyang\n",

                "- 1 sisir pisang kepok kuning\n" +
                        "- 250 gram tepung terigu\n" +
                        "- 2 sdm gula pasir\n" +
                        "- 125 ml susu cair\n" +
                        "- 1 sdt essen vanila\n" +
                        "- 150 gram keju chedar yang sudah diparut\n" +
                        "- 1 sdt garam\n" +
                        "- 250 gram tepung panir kasar\n" +
                        "- Minyak goreng secukupnya\n" +
                        "- 1 buah kuning telur\n" +
                        "- 50 gram keju chedar diparut\n" +
                        "- 100 ml susu cair\n" +
                        "- 10 sdm susu kental manis\n" +
                        "- 1 sdm tepung maizena yang dilarutkan dengan sedikit air\n",

                "- Kelapa setengah tua 200 gram\n" +
                        "- Gula pasir 100 gram\n" +
                        "- Daun pandan 1 lembar saja\n" +
                        "- Air bersih 100 ml\n" +
                        "- Garam dapur 1/2 sendok kecil\n" +
                        "- Vanila halus 0.25 sendok kecil\n",

                "- Tepung terigu 1/2 kg\n" +
                        "- Kentang kukus dan dihaluskan 200 gram\n" +
                        "- Kuning telur ayam 4 pcs\n" +
                        "- Ragi 11 gram saja\n" +
                        "- Mentega 75 gram\n" +
                        "- Susu bubuk 50 gram\n" +
                        "- Gula halus 100 gram\n" +
                        "- Garam dapur 1/4 sendok kecil\n" +
                        "- Air dingin 100 ml\n" +
                        "- Minyak goreng secukupnya\n",

                "- 4 buah nanas uk. sedang \n" +
                        "- 4 buah Cengkeh\n" +
                        "- 2 batang Kayu manis\n" +
                        "- 1-2 sdm Gula pasir \n" +
                        "- 6 btr kuning telur\n" +
                        "- 500 gr margarin\n" +
                        "- 75 gr mentega/butter\n" +
                        "- 750 gr tepung terigu \n" +
                        "- 2 sdm gula halus\n" +
                        "- 2 sdm susu putih bubuk\n" +
                        "- 1 sdt vanila bubuk\n" +
                        "- 1 kotak (180 gr) keju cheddar parut\n"
        };

        String[] procedure = {
                "1. Ambil tempat adoanan. Masukkan 3 pcs kuning telur, 1 pcs putih telur, gula pasir dan seperempat cake emulsifernya.\n" +
                        "2. Kocok semua bahan diatas dengan mixer sampai semua bahan tercampur rata dan mengembang.\n" +
                        "3. Ambil tempat lagi. Masukkan 50 gram tepung terigunya, 10 gram susu bubuk dan baking powdernya. Aduk semua bahan sampai rata dan ayak sampai halus.\n" +
                        "4. Campurkan campuran tepung diatas ke dalam adonan utama. Aduk semua bahan sampai tercampur sempurna.\n" +
                        "5. Tuang margarin cair sedikit demi sedikit sambil diaduk sampai rata.\n" +
                        "6. Masukkan 50 gram coklat putih cair sedikit demi sedikit sambil diaduk.\n" +
                        "7. Masukkan pasta pandan nya sambil tetap diaduk sampai rata.\n" +
                        "8. Siapkan loyang dan taruh kertas roti diatasnya.\n" +
                        "9. Tuang adonan nrownis kukus pandan nya kle atas loyang.\n" +
                        "10. Masukkan ke dalam kukusan dengan api sedang kecil. Kukus sampai matang atau kurang lebih sekitar 21-23 menit.\n" +
                        "11. Angkat dan tunggu sampai dingin sebelum di olesi dengan cream, parutan keju, butiran coklat atau bahan tambahan yang lain.\n",

                "1. Pertama campurkan tepung terigu, gula pasir, susu cair, essen vanila, garam dan keju. Kejunya 50 gram aja ya, nanti sisanya buat di campuran yang lain. Campurkan sampai jadi adonan basah yang rata dan kental, sisihkan.\n" +
                        "2. Setelah itu siapkan campuran untuk baluran biar tambah crispy, yaitu tepung panir kasar dan 100 gram keju chedar parut. Campur bahan kering sampai rata ya, kemudian disisihkan dulu.\n" +
                        "3. Siapkan pisang, potong jadi bentuk kipas, atau belah dua juga boleh. Usahakan saat membelah jangan sampai putus, biar bentuknya bagus.\n" +
                        "4. Masukkan pisang yang sudah dipotong tadi ke dalam adonan basah. Kemudian gulungkan ke bahan kering, yang campuran tepung panir sama keju tadi. Simpan dalam kulkas selama 15 menit.\n" +
                        "5. Sambil menunggu pisang yang baru disimpan, buat sausnya dulu. Kocok kuning telur, susu kental manis dan susu cair di atas api sedang. Kemudian masukkan susu kental manis dan parutan keju chedar, aduk sampai tercampur rata. Masukkan larutan tepung maizena, aduk kembali hingga saus mengental, lalu matikan apinya.\n" +
                        "6. Setelah pisang siap, panaskan minyak lalu goreng pisang sampai matang. Kemudian angkat dan dinginkan pisang gorengnya.\n" +
                        "7. Pisang goreng siap disajikan, jangan lupa sausnya ya. Bisa dituangkan di atas pisang goreng, atau dipisahkan dalam wadah tersendiri.\n",

                "1. Bersihkan daun suji lalu haluskan menggunakan blender.\n" +
                        "2. Saring dengan menggunakan penyaring, ambil airnya.\n" +
                        "3. Masukkan telur dalam wadah bersih.\n" +
                        "4. Tambahkan tepung terigu dan air secukupnya.\n" +
                        "5. Masukkan air daun suji yang telah dibersihkan dari ampas.\n" +
                        "6. Haduk hingga keseluruhan bahan tercampur.\n" +
                        "7. Usahakan agar kekentalan adonan merata.\n" +
                        "8. Masak gula jawa dengan cara memotong gula jawa menjadi bagian kecil, tuangkan sedikit air.\n" +
                        "9. Didihkan hingga gula mencair.\n" +
                        "10. Saring gula jawa buang kotorannya.\n" +
                        "11. Masukkan kelapa parut dalam wajan bersih, tambahkan gula jawa.\n" +
                        "12. Masak kelapa tersebut dengan api sedang, tambahkan vanili dan juga daun pandan.\n" +
                        "13. Siapkan wajan anti lengket, oleskan dengan minyak goreng sedikit, masukkan sedikit adonan tepung untuk membuat kulit dadar. Gunakan api kecil.\n" +
                        "14. Tunggu adonan hingga mongering, lalu angkat.\n" +
                        "15. Letakkan pada wadah datar bersih.\n" +
                        "16. Lakukan keseluruhan proses untuk semua adonan kulit.\n" +
                        "17. Ambil kelapa yang telah dimasak, sesuaikan jumlah dan besaran kulit dadar.\n" +
                        "18. Tekuk bagian kiri ke kanan dan bagian kanan ke kiri, gulung.\n" +
                        "19. Lakukan pada semua kulit dadar.\n" +
                        "20. Sajikan.\n",

                "1. Kupas 100 gram kentang, rebus selama 7 - 10 menit, lalu tumbuk halus\n" +
                        "2. Campurkan 397 gram tepung terigu protein tinggi, 2 Sdm gula pasir, 2 Sdm susu bubuk full cream, 1/4 Sdm ragi instan, dan 1/4 baking powder. Aduk adonan hingga rata.\n" +
                        "3. Masukkan 1 kuning telur dan kentang yang sudah dihaluskan. Tuangkan air dingin sedikit demi sedikit sebanyak 80mL sambil diuleni hingga adonan menjadi kalis. Untuk membuat adonan menjadi kalis kira-kira diuleni selama 15 menit.\n" +
                        "4. Diamkan adonan donat selama kurang lebih 30 menit. Gunakan serbet lembab untuk menutupi adonan donat kentang. Fungsinya adalah agar adonan donat tidak menjadi kering. Jika lebih dari 30 menit didiamkan maka sebaiknya Anda cek terlebih dahulu bau adonannya, apakah bau SANGIT atau tidak. Jika sudah bau sangit, rasanya jadi kurang enak.\n" +
                        "5. Setelah 30 menit didiamkan maka adonan akan mengembang (idealnya) dua kali lipat ukuran semula, kempiskan adonan sembari cek elstisitas adonan. Kemudian bentuk adonan menjadi bentuk donat dengan cara dipipihkan menggunakan tangan atau rolling pin. kemudian dibentuk bulat menggunakan tangan atau cetakan donat Resep Donat Kentang Empuk, Lembut, Dan Enak\n" +
                        "6. Setelah dibentuk, jika ingin adonan lebih mengembang dapat diamkan selama kurang lebih 20-30 menit (saya tidak mendiamkan adonan karena saat membentuk donat sudah memakan waktu 20-30 menit).\n" +
                        "7. Goreng donat kentang dengan menggunakan api kecil hingga berubah warna kuning emas kecoklatan.\n" +
                        "8. Angkat dan dinginkan sejenak. Hiasi donat dengan topping seleramu (saya menggunakan gula halus).\n",

                "1. Masak nanas yg sudah diparut diatas kompor api kecil, usahakan wajan anti lengket. Masukkan semua bahan selai, aduk terus hingga kering. Jika sudah selesai, diangin2kan dan masukkan sebentar ke dlm kulkas agar mudah dibentuk bulatan kecil (jika perlu).\n" +
                        "2. Mixer telur, mentega, roombutter, gula halus hingga rata. Tidak lebih dari 1 menit. Gunanya hanya supaya adonan menyatu. TIDAK dimixer sampai adonan putih pucat ya..\n" +
                        "3. Masukkan keju parut, aduk sebentar dengan spatula.\n" +
                        "4. Tambahkan terigu, susu bubuk, vanili bubuk aduk hingga rata dan bisa diuleni dengan tangan.\n" +
                        "5. Adonan dibentuk bulat kecil atau sesuai selera dan diisi selai nanas. Adonan jangan terlalu lama dipegang dgn tangan yaa..\n" +
                        "6. Masukkan kedalam oven selama kurang lebih 10 menit.\n" +
                        "7. Keluarkan sebentar dan diberi olesan kuning telur yang sudah dicampur sedikit susu cair. Lalu beri taburan keju diatasnya. Masukkan kembali kedalam oven selama 5-10 menit hingga bagian bawah kue sedikit kecoklatan.\n" +
                        "8. Sebelum dimasukkan ke toples, sebaiknya tunggu hingga kue benar2 dingin :)\n"
        };

        ArrayList<ModelResep> reseplist = new ArrayList<>();

        for (int i=0; i<judul.length; i++){
            ModelResep resep = new ModelResep(image[i],judul[i],deskripsi[i],bahan[i],procedure[i]);
            reseplist.add(resep);
        }

        ResepAdapter adapterResep = new ResepAdapter(this, reseplist);
        recyclerView.setAdapter(adapterResep);
    }
}
