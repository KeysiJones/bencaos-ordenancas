package com.kdev.ordenancas.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Button
import android.widget.Toast
import android.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.kdev.ordenancas.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [OracoesDedicatoriasFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class OracoesDedicatoriasFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val inflater = inflater.inflate(R.layout.fragment_oracoes_dedicatorias, container, false)
        val toolbar = inflater.findViewById<Toolbar>(R.id.oracoes_dedicatorias_toolbar)

        activity?.setActionBar(toolbar)
        activity?.actionBar?.setDisplayShowHomeEnabled(true)
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        activity?.actionBar?.title  = "Orações sacramentais"
        setHasOptionsMenu(true)

        inflater.findViewById<Button>(R.id.btnBreadPrayer).setOnClickListener {
            findNavController().navigate(R.id.action_oracoesDedicatoriasFragment_to_oracaoPaoFragment)
        }

        inflater.findViewById<Button>(R.id.btnWaterPrayer).setOnClickListener {
            findNavController().navigate(R.id.action_oracoesDedicatoriasFragment_to_oracaoAguaFragment)
        }

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