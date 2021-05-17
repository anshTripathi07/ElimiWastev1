package com.example.elimiwastev1;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


//Update 2
public class NoteAdapter extends ArrayAdapter<Note> {

    public NoteAdapter(Context context, List<Note> notes)
    {

        super(context, 0, notes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Note note = getItem(position);
        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.note_cell, parent, false);

        TextView title = convertView.findViewById(R.id.cellTitle);
        TextView desc = convertView.findViewById(R.id.cellDesc);
        TextView expiry = convertView.findViewById(R.id.exDate); //added
        TextView label1 = convertView.findViewById(R.id.textView);
        TextView label2 = convertView.findViewById(R.id.textView2);

        title.setText(note.getTitle());
        desc.setText(note.getDescription());
        expiry.setText(note.getExpiration()); //added

        return convertView;
    }

}
