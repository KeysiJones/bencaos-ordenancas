package com.kdev.ordenancas.adapter;

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.kdev.ordenancas.R

class BencaosSacerdocioAdapter : RecyclerView.Adapter<BencaosSacerdocioAdapter.BencaosSacerdocioViewHolder>() {

    private val bencaoName = arrayOf(
            "Benção de saúde",
            "Benção de consolo e conforto",
            "Batismo",
            "Confirmação",
            "Sacerdócio Aarônico",
            "Sacerdócio de Melquisedeque",
            "Benção de saúde",
            "Benção de consolo e conforto",
            "Batismo",
            "Sacerdócio Aarônico",
            "Sacerdócio de Melquisedeque",
            "Benção de saúde",
            "Benção de consolo e conforto",
            "Batismo",
            "Sacerdócio Aarônico",
            "Sacerdócio de Melquisedeque"
    )

    private val bencaoText = arrayOf(
            R.string.bencao_enfermos,
            R.string.bencao_consolo,
            R.string.ordenanca_batismo,
            R.string.ordenanca_confirmacao,
            R.string.bencao_consolo,
            R.string.bencao_consolo,
            R.string.bencao_enfermos,
            R.string.bencao_consolo,
            R.string.ordenanca_batismo,
            R.string.bencao_consolo,
            R.string.bencao_consolo,
            R.string.bencao_enfermos,
            R.string.bencao_consolo,
            R.string.ordenanca_batismo,
            R.string.bencao_consolo,
            R.string.bencao_consolo
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BencaosSacerdocioAdapter.BencaosSacerdocioViewHolder {
        val v = LayoutInflater.from(parent.context)
                .inflate(R.layout.bencaos_sacerdocio_view, parent, false)
        return BencaosSacerdocioViewHolder(v)
    }

    override fun getItemCount() = bencaoName.size

    override fun onBindViewHolder(holder: BencaosSacerdocioViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class BencaosSacerdocioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(position: Int) {

            val bencaoTitle = itemView.findViewById<TextView>(R.id.bencao_type_title);
            bencaoTitle.text = bencaoName[position]

            itemView.setOnLongClickListener { view ->
                Toast.makeText(itemView.context, bencaoTitle.text, Toast.LENGTH_SHORT).show()
                true
            }

            itemView.setOnClickListener {
                var bundle: Bundle = Bundle()

                bundle.putString("bencaoTitle", bencaoName[position])
                bundle.putString("bencaoText", itemView.context.getString(bencaoText[position]))

                Navigation.findNavController(itemView).navigate(R.id.action_bencaosSacerdocioFragment_to_bencaosDetailFragment, bundle)
            }
        }
    }
}
