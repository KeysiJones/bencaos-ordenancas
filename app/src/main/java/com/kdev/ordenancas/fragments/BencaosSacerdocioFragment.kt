package com.kdev.ordenancas.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import android.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kdev.ordenancas.R
import com.kdev.ordenancas.adapter.BencaosSacerdocioAdapter
/**
 * A simple [Fragment] subclass.
 * Use the [BencaosSacerdocioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BencaosSacerdocioFragment : Fragment() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<BencaosSacerdocioAdapter.BencaosSacerdocioViewHolder>? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_bencaos_sacerdocio, container, false)
        val toolbar = binding.findViewById<Toolbar>(R.id.menu_principal_toolbar)

        activity?.setActionBar(toolbar)
        activity?.actionBar?.setDisplayShowHomeEnabled(true)
        activity?.actionBar?.setDisplayHomeAsUpEnabled(true)
        setHasOptionsMenu(true)

        return binding
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.bencaosSacerdocioRecyclerView).apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = GridLayoutManager(activity, 3)
            // set the custom adapter to the RecyclerView
            adapter = BencaosSacerdocioAdapter()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_padrao, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_adicionar -> {
                Toast.makeText(view?.context, "Adicionado... ${item.itemId}", Toast.LENGTH_SHORT).show()
            }

            R.id.menu_cancelar -> {
                Toast.makeText(context, "Cancelando...", Toast.LENGTH_SHORT).show()
            }

            else -> {
                activity?.onBackPressed()
            }
        }
        return true
    }
}