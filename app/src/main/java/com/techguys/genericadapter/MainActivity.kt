package com.techguys.genericadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val genericAdapter = GenericAdapter<Contact>(R.layout.item_contacts_list)

        genericAdapter.setOnListItemViewClickListener(object : GenericAdapter.OnListItemViewClickListener{
            override fun onClick(view: View, position: Int) {
                Toast.makeText(view.context, "Clicked at row $position", Toast.LENGTH_LONG).show()
            }

        })
        rv.adapter = genericAdapter
        genericAdapter.addItems(DataGenerator.getContacts())
    }
}
