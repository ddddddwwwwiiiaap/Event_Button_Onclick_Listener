package com.example.eventbuttononclicklistener;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {

    // Ddeklarasi variable dengan jenis data Context
    Context mContext;

    // Deklarasi variable dengan jenis data layout inflater
    LayoutInflater inflater;

    // Deklarasi Variable dengan jenis data arraylist
    private ArrayList<ClassNama>arrayList;

    // membuat konstruktor ListviewAdapter
    public  ListViewAdapter(Context context){
        //Memberi nilai mContext dengan context
        mContext = context;

        // mengatur Layout inflater dari context yang diverikan
        inflater = LayoutInflater.from(mContext);

        // memberikan nilai arraylist dari class ClassNama
        this.arrayList = new ArrayList<ClassNama>();

        // menambahkan semua elemen ke arraylist
        this.arrayList.addAll(Home_Activity.classNamaArrayList);;
    }

    @Override
    public int getCount() {
        // mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }

    // Fungsi ini digunakan untuk mendapatkan data item yang terkait dengan posisi
    // tertentu dalam kumpulan data untuk mendapatkan data yang sesuai dari lokasi
    // tertentu dalam pengumpulan data item
    @Override
    public Object getItem(int i) {
        // mengembalikan nilai berupa objek dari array data
        return Home_Activity.classNamaArrayList.get(i);
    }

    // Fungsi mengembalikan "nilai" dari posisi item ke adaptor
    @Override
    public long getItemId(int i) {
        return i;
    }

    // Funsgsi ini secara otomatis dipanggil ketika tampilan item list siap untuk
    // ditampilkan atau akan ditampilkan
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // dekalarasi variable dengan jenis data ViewHolder
        final  ViewHolder holder;

        // membuat kondisi apakah view null atau tidak
        if(view == null){

            // Membuat objek view holder
            holder = new ViewHolder();

            // mengatur layour untuk menampilkan item
            view = inflater.inflate(R.layout.item_listview, null);

            // set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            // menyimpan data dalam tampilan tanpa menggunakan struktur data lain.
            view.setTag(holder);
        }
        else {
            // mengatur holder untuk mengembalikan nilai dari view tag
            holder = (ViewHolder) view.getTag();
        }
        // set item ke TextViews
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        // mengembalikan nilai ke variable view
        return view;
    }
}
