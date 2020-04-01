package com.example.dzikirpagipetangapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.dzikirpagipetangapp.Constants
import com.example.dzikirpagipetangapp.R
import com.example.dzikirpagipetangapp.adapters.DzikirListFragmentAdapter
import com.example.dzikirpagipetangapp.fragment.FragmentPagi
import com.example.dzikirpagipetangapp.fragment.FragmentPetang
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_about.*
import kotlinx.android.synthetic.main.activity_dzikir_list.*
import com.google.android.material.tabs.TabLayoutMediator

class DzikirListActivity : AppCompatActivity (){

    private lateinit var textMessage: TextView // ini untuk messega hello

    val screenList = arrayListOf<Fragment>()

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                val intent = Intent(this, MainActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                val intent = Intent(this, AboutActivity::class.java)
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dzikir_list)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.menu.getItem(1).isChecked = true
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener) // set nav_view
//        viewpager_dzikir_screen_list.adapter = DemoViewPagerAdapter()


        setFragment(1)



    }

    private fun setFragment(fmType:Int = 1){
        //untuk awal pake int unutk nentuin fragment,
        // tapi nanti coba untuk nentuin fragment pake fmType:Fragment
        val screensAdapter = DzikirListFragmentAdapter(supportFragmentManager, lifecycle)

        // bikin if untuk nentuin fragment
        if (fmType == 1) {
            screensAdapter.addFragment(FragmentPagi())
            screensAdapter.addFragment(FragmentPetang())
        }else{

        }


        //set adapter
        viewpager_dzikir_screen_list.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewpager_dzikir_screen_list.adapter = screensAdapter

//        tabLayout.setupWithViewPager() // belum bisa, klo pake ini bisa di klik tabnya

        //set tab text
        TabLayoutMediator(tabLayout, viewpager_dzikir_screen_list, object : TabLayoutMediator.OnConfigureTabCallback {
            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
                // Styling each tab here
                val constant = Constants(this@DzikirListActivity)
                tab.text = "DZIKIR ${constant.TITLE_DOA_ARRAY[position]}"

            }
        }).attach()
    }

    override fun onBackPressed() {
        val intent = Intent(this, MainActivity::class.java)
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent)
        super.onBackPressed()
    }

}