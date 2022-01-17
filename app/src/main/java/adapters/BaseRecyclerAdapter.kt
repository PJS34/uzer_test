package adapters

import BaseViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.uzer_test.R
import com.squareup.picasso.Picasso

class BaseRecyclerAdapter(val list: List<Pair<String, String>>) :
    RecyclerView.Adapter<BaseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.recycler_base_item, parent, false)
        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

        val listData = list[position]
        holder.textView.text = listData.first
        Picasso.get().load(listData.second).placeholder(R.mipmap.ic_launcher).into(holder.imageView)
    }

    override fun getItemCount(): Int = list.size
}


