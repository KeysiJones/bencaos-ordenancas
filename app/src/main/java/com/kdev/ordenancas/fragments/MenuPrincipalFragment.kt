package com.kdev.ordenancas.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.findNavController
import com.kdev.ordenancas.R
import com.kdev.ordenancas.databinding.FragmentMenuPrincipalBinding

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
        val binding = FragmentMenuPrincipalBinding.inflate(inflater)
        val toolbar = binding.menuPrincipalToolbar.appToolbar

        activity?.setActionBar(toolbar)
        activity?.actionBar?.setDisplayShowHomeEnabled(true)
        setHasOptionsMenu(true)

        binding.oracoesDedicatorias.setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_oracoesDedicatoriasFragment)
        }

        binding.btnBlessingsMenu.setOnClickListener {
            findNavController().navigate(R.id.action_menuPrincipalFragment_to_bencaosSacerdocioFragment)
        }

        toolbar.setNavigationOnClickListener { view ->
            val myDrawerMenu = activity?.findViewById<DrawerLayout>(R.id.drawerLayout)
            myDrawerMenu?.openDrawer(Gravity.LEFT)
        }

        return binding.root.rootView
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