package com.example.dzikirpagipetangapp

import android.content.Context
import android.provider.Settings.System.getString
import java.io.Serializable
import kotlin.coroutines.coroutineContext

data class DoaItem(
    var checked: Boolean = false,
    val title: String? ="contoh title",

    // jd list of string smua kalo di 3 Qul
    val doa_pagi_item_arab: String? = null,
    val doa_pagi_item_latin: String? = null,
    val doa_pagi_item_arti: String? = null,
    val doa_pagi_item_hadits: List<String>? = null// ini kyknya coba list of String



    ) :Serializable


class Constants (context: Context){
    val LIST_DOA_PAGI =
            arrayListOf<DoaItem>(
//            arrayListOf<String>(
                DoaItem(false,
                    "Ta'awudz",
                    context.resources.getString(R.string.taawudz_arab),
                    context.resources.getString(R.string.taawudz_latin),
                    context.resources.getString(R.string.taawudz_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Ayat Kursiy",
                    context.resources.getString(R.string.ayat_kursi_arab),
                    context.resources.getString(R.string.ayat_kursi_latin),
                    context.resources.getString(R.string.ayat_kursi_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Al-Ikhlas (di baca 3x)",
                    context.resources.getString(R.string.al_ikhlas_arab),
                    context.resources.getString(R.string.al_ikhlas_latin),
                    context.resources.getString(R.string.al_ikhlas_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),
                DoaItem(false,
                    "Al-Falaq (di baca 3x)",
                    context.resources.getString(R.string.al_falaq_arab),
                    context.resources.getString(R.string.al_falaq_latin),
                    context.resources.getString(R.string.al_falaq_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "An-Naas (di baca 3x)",
                    context.resources.getString(R.string.an_nas_arab),
                    context.resources.getString(R.string.an_nas_latin),
                    context.resources.getString(R.string.an_nas_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Sayyidul Istighfar",
                    context.resources.getString(R.string.sayyidul_istighfar_arab),
                    context.resources.getString(R.string.sayyidul_istighfar_latin),
                    context.resources.getString(R.string.sayyidul_istighfar_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Tasbih Pagi (di baca 3x)",
                    context.resources.getString(R.string.tasbih_pagi_arab),
                    context.resources.getString(R.string.tasbih_pagi_latin),
                    context.resources.getString(R.string.tasbih_pagi_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    ))
                ,

                DoaItem(false,
                    "Do'a Memohon Rezeki, Ilmu, Amal",
                    context.resources.getString(R.string.doa_rizki_ilmu_amal_arab),
                    context.resources.getString(R.string.doa_rizki_ilmu_amal_latin),
                    context.resources.getString(R.string.doa_rizki_ilmu_amal_arti),
                    arrayListOf(
                        context.resources.getString(R.string.doa_rizki_ilmu_amal_hadits_1)
                    )),

                DoaItem(false,
                    "Do'a Pagi #1",
                    context.resources.getString(R.string.doa_pagi_1_arab),
                    context.resources.getString(R.string.doa_pagi_1_latin),
                    context.resources.getString(R.string.doa_pagi_1_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Pagi #2",
                    context.resources.getString(R.string.doa_pagi_2_arab),
                    context.resources.getString(R.string.doa_pagi_2_latin),
                    context.resources.getString(R.string.doa_pagi_2_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Pagi #3",
                    context.resources.getString(R.string.doa_pagi_3_arab),
                    context.resources.getString(R.string.doa_pagi_3_latin),
                    context.resources.getString(R.string.doa_pagi_3_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Marabahaya",
                    context.resources.getString(R.string.doa_perlindungan_bahaya_arab),
                    context.resources.getString(R.string.doa_perlindungan_bahaya_latin),
                    context.resources.getString(R.string.doa_perlindungan_bahaya_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Dari Segala Makhluk",
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_arab),
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_latin),
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Meminta Kesehatan, Selamat Dari kefakiran, kekufuran, dan adzab kubur",
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_arab),
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_latin),
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_arti),
                   arrayListOf(
                       context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_hadits),
                        ""
                    )),

                DoaItem(false,
                    "Do'a Meminta Pertolongan Allah Subhanahu Wata'ala",
                    context.resources.getString(R.string.doa_pertolongan_arab),
                    context.resources.getString(R.string.doa_pertolongan_latin),
                    context.resources.getString(R.string.doa_pertolongan_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Diri, Harta, Keluarga",
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_arab),
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_latin),
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Terhindar dari keburukan Nafsu dan Syaithan",
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_arab),
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_latin),
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Tasbih 100x",
                    context.resources.getString(R.string.tasbih_arab),
                    context.resources.getString(R.string.tasbih_latin),
                    context.resources.getString(R.string.tasbih_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Istighfar 100x",
                    context.resources.getString(R.string.istighfar_arab),
                    context.resources.getString(R.string.istighfar_latin),
                    context.resources.getString(R.string.istighfar_arti),
                    arrayListOf("Hadits1", "Hadits2"))

            )


    val LIST_DOA_PETANG =
//        arrayListOf <String> (
            arrayListOf <DoaItem> (
                DoaItem(false,
                    "Ta'awudz",
                    context.resources.getString(R.string.taawudz_arab),
                    context.resources.getString(R.string.taawudz_latin),
                    context.resources.getString(R.string.taawudz_arti),
                    arrayListOf("Hadits1 Petang", "Hadits2 Petang")),

                DoaItem(false,
                    "Ayat Kursiy",
                    context.resources.getString(R.string.ayat_kursi_arab),
                    context.resources.getString(R.string.ayat_kursi_latin),
                    context.resources.getString(R.string.ayat_kursi_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Al-Ikhlas (di baca 3x)",
                    context.resources.getString(R.string.al_ikhlas_arab),
                    context.resources.getString(R.string.al_ikhlas_latin),
                    context.resources.getString(R.string.al_ikhlas_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),
                DoaItem(false,
                    "Al-Falaq (di baca 3x)",
                    context.resources.getString(R.string.al_falaq_arab),
                    context.resources.getString(R.string.al_falaq_latin),
                    context.resources.getString(R.string.al_falaq_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "An-Naas (di baca 3x)",
                    context.resources.getString(R.string.an_nas_arab),
                    context.resources.getString(R.string.an_nas_latin),
                    context.resources.getString(R.string.an_nas_arti),
                    arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    ))
                ,

                DoaItem(false,
                    "Sayyidul Istighfar",
                    context.resources.getString(R.string.sayyidul_istighfar_arab),
                    context.resources.getString(R.string.sayyidul_istighfar_latin),
                    context.resources.getString(R.string.sayyidul_istighfar_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Petang #1",
                    context.resources.getString(R.string.doa_petang_1_arab),
                    context.resources.getString(R.string.doa_petang_1_latin),
                    context.resources.getString(R.string.doa_petang_1_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Petang #2",
                    context.resources.getString(R.string.doa_petang_2_arab),
                    context.resources.getString(R.string.doa_petang_2_latin),
                    context.resources.getString(R.string.doa_petang_2_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Petang #3",
                    context.resources.getString(R.string.doa_petang_3_arab),
                    context.resources.getString(R.string.doa_petang_3_latin),
                    context.resources.getString(R.string.doa_petang_3_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Marabahaya",
                    context.resources.getString(R.string.doa_perlindungan_bahaya_arab),
                    context.resources.getString(R.string.doa_perlindungan_bahaya_latin),
                    context.resources.getString(R.string.doa_perlindungan_bahaya_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Dari Segala Makhluk",
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_arab),
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_latin),
                    context.resources.getString(R.string.doa_perlindungan_segala_makhluk_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Meminta Kesehatan, Selamat dari kefakiran, kekufuran dan adzab kubur",
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_arab),
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_latin),
                    context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_arti),
                   arrayListOf(
                       context.resources.getString(R.string.doa_kesehatan_selamat_dr_fakir_kufur_adzab_kubur_hadits),
                        ""
                    )),

                DoaItem(false,
                    "Do'a Meminta Pertolongan Allah Subhanahu Wata'ala",
                    context.resources.getString(R.string.doa_pertolongan_arab),
                    context.resources.getString(R.string.doa_pertolongan_latin),
                    context.resources.getString(R.string.doa_pertolongan_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Perlindungan Diri, Harta, Keluarga",
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_arab),
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_latin),
                    context.resources.getString(R.string.doa_perlindungan_harta_diri_keluarga_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Do'a Terhindar dari keburukan Nafsu dan Syaithan",
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_arab),
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_latin),
                    context.resources.getString(R.string.doa_perlindungan_nafsu_dan_syathan_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Tasbih 100x",
                    context.resources.getString(R.string.tasbih_arab),
                    context.resources.getString(R.string.tasbih_latin),
                    context.resources.getString(R.string.tasbih_arti),
                   arrayListOf(
                        "Hadits1",
                        "Hadits2"
                    )),

                DoaItem(false,
                    "Istighfar 100x",
                    context.resources.getString(R.string.istighfar_arab),
                    context.resources.getString(R.string.istighfar_latin),
                    context.resources.getString(R.string.istighfar_arti),
                    arrayListOf("Hadits1", "Hadits2"))
    )


    val TITLE_DOA_ARRAY = listOf<String>(
        "DO'A PAGI",
        "DO'A PETANG"
    )

    val TITLE_DETAIL_DOA_PAGI :String = "Dzikir Do'a Pagi"
    val TITLE_DETAIL_DOA_PETANG :String = "Dzikir Do'a Petang "

    val KEY_DETAIL_DOA_TITLE:String = "detail_doa_title"
    val KEY_DETAIL_DOA_OBJECT:String = "detail_doa_obj"
}
