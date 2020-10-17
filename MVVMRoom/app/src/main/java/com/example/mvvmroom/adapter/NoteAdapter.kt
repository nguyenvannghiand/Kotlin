package com.example.mvvmroom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmroom.R
import com.example.mvvmroom.model.Note

class NoteAdapter(val delete:(item: Note) -> Unit) : RecyclerView.Adapter<NoteAdapter.NoteHolder>() {
    private var notesList: List<Note> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return NoteHolder(itemView)
    }

    override fun onBindViewHolder(holder: NoteHolder, position: Int) {
        var currentNote = notesList.get(position)
        holder.tvTitle.text = currentNote.title
        holder.tvDescription.text = currentNote.description
        //
        holder.itemView.setOnLongClickListener {
            delete(currentNote)
            true
        }

    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    fun setNotesList(notes: List<Note>) {
        this.notesList = notes
        notifyDataSetChanged()
    }

    inner class NoteHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_title_item_note)
        var tvDescription: TextView = itemView.findViewById(R.id.tv_description_item_note)
    }
}
