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
 * Use the [MenuPrincipalFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuPrincipalFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = inflater.inflate(R.layout.fragment_menu_principal, container, false)
        val toolbar = binding.findViewById<Toolbar>(R.id.menu_principal_toolbar)

        activity?.setActionBar(toolbar)
        activity?.actionBar?.setDisplayShowHomeEnabled(true)
        //setHasOptionsMenu(true)

        binding.findViewById<Button>(R.id.oracoes_dedicatorias).setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_oracoesDedicatoriasFragment)
        }

        binding.findViewById<Button>(R.id.btnBlessingsMenu).setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_bencaosSacerdocioFragment)
        }

        toolbar.setNavigationOnClickListener { view ->
            val myDrawerMenu = activity?.findViewById<DrawerLayout>(R.id.drawerLayout)
            myDrawerMenu?.openDrawer(Gravity.LEFT)
        }

        return binding
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater.inflate(R.menu.menu_dados_fragment, menu)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//            R.id.menu_adicionar -> {
//                Toast.makeText(view?.context, "Adicionado... ${item.itemId}", Toast.LENGTH_SHORT).show()
//            }
//
//            R.id.menu_cancelar -> {
//                Toast.makeText(context, "Cancelando...", Toast.LENGTH_SHORT).show()
//            }
//
//            else -> {
//                activity?.onBackPressed()
//            }
//        }
//        return true
//    }
}