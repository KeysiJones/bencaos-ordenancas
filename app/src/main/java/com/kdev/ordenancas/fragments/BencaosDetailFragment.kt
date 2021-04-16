package com.kdev.ordenancas.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.Toolbar
import com.kdev.ordenancas.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BencaosDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BencaosDetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val inflater = inflater.inflate(R.layout.fragment_bencaos_detail, container, false)

        var titulo: String? = arguments?.getString("bencaoTitle")
        var texto: String? = arguments?.getString("bencaoText")

        inflater.findViewById<TextView>(R.id.bencao_title)?.text = titulo
        inflater.findViewById<TextView>(R.id.bencao_text)?.text = texto

        val toolbar = inflater.findViewById<Toolbar>(R.id.detail_toolbar)

        activity?.setActionBar(toolbar)

        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title  = "Bençãos e Ordenanças"
        setHasOptionsMenu(true)

        return inflater
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_padrao, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        activity?.onBackPressed()
        return true
    }

}